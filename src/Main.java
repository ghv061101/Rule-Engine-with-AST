import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Sample user data
        Map<String, Object> userData = new HashMap<>();
        userData.put("age", 35);
        userData.put("department", "Sales");
        userData.put("salary", 60000);
        userData.put("experience", 3);

        // Creating a rule
        RuleCreator ruleCreator = new RuleCreator();
        String ruleString = "age > 30 AND department = 'Sales'";
        Node ast = ruleCreator.createRule(ruleString);

        // Evaluating the rule
        RuleEvaluator evaluator = new RuleEvaluator();
        boolean result = evaluator.evaluateRule(ast, userData);
        System.out.println("Rule evaluation result: " + result);

        // Modifying the rule
        RuleModifier ruleModifier = new RuleModifier();
        ruleModifier.modifyCondition(ast, "age > 30", "age < 40");
        result = evaluator.evaluateRule(ast, userData);
        System.out.println("Modified rule evaluation result: " + result);
    }
}
