package ast;

public class RuleModifier {
    public Node modifyRule(Node root, String targetValue, String newValue) {
        if (root == null) {
            return null;
        }

        // Check if the current node is an operand and matches the target value
        if (root.getType().equals("operand") && root.getValue().equals(targetValue)) {
            // Modify the value of the node
            root.setValue(newValue);
        } else if (root.getType().equals("operator")) {
            // Recursively modify left and right children
            root.setLeft(modifyRule(root.getLeft(), targetValue, newValue));
            root.setRight(modifyRule(root.getRight(), targetValue, newValue));
        }

        return root; // Return the modified root
    }
}
