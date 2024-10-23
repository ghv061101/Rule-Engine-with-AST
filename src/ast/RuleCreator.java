package ast;

public class RuleCreator {
    public Node createRule(String ruleString) {
        // For this example, we will create a simple node.
        // You will need to implement a proper parser for complex rule strings.
        return new Node("operand", ruleString);
    }
}
