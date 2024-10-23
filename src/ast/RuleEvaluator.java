package ast;

public class RuleEvaluator {
    public boolean evaluateRule(Node node, UserData userData) {
        if (node.getType().equals("operand")) {
            // Clean the condition value
            String condition = node.getValue().replaceAll("[()]", "").trim(); // Remove parentheses
            String[] parts = condition.split("(?<=\\S) (?=AND|OR|\\()|(?<=AND|OR) (?=\\S)"); // Split by logical operators

            // Assuming the last element is an operand, and the rest are conditions
            boolean result = evaluateCondition(parts[0].trim(), userData);

            for (int i = 1; i < parts.length; i++) {
                String operator = parts[i].trim();
                String nextCondition = parts[++i].trim();

                // Evaluate the next condition and combine results
                if (operator.equals("AND")) {
                    result = result && evaluateCondition(nextCondition, userData);
                } else if (operator.equals("OR")) {
                    result = result || evaluateCondition(nextCondition, userData);
                }
            }
            return result;
        } else {
            boolean leftEval = evaluateRule(node.getLeft(), userData);
            boolean rightEval = evaluateRule(node.getRight(), userData);
            return node.getValue().equals("AND") ? (leftEval && rightEval) : (leftEval || rightEval);
        }
    }

    private boolean evaluateCondition(String condition, UserData userData) {
        String[] parts = condition.split(" "); // Split condition into parts

        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid condition format: '" + condition + "'. Expected format: 'attribute operator value'.");
        }

        String attribute = parts[0].trim();
        String operator = parts[1].trim();
        String targetValue = parts[2].replaceAll("\"", "").trim(); // Remove any quotes from target value

        String userValue = userData.getAttribute(attribute);
        return evaluateCondition(userValue, operator, targetValue);
    }

    private boolean evaluateCondition(String userValue, String operator, String targetValue) {
        if (userValue == null) {
            return false;
        }

        switch (operator) {
            case ">":
                return Integer.parseInt(userValue) > Integer.parseInt(targetValue);
            case "<":
                return Integer.parseInt(userValue) < Integer.parseInt(targetValue);
            case "=":
                return userValue.equals(targetValue);
            default:
                return false;
        }
    }
}
