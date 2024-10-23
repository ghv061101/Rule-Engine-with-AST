package ast;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserData userData = new UserData();
        userData.setAttribute("age", "35");
        userData.setAttribute("department", "Sales");
        userData.setAttribute("salary", "60000");
        userData.setAttribute("experience", "3");

        RuleEvaluator evaluator = new RuleEvaluator();
        RuleCreator creator = new RuleCreator();
        Scanner scanner = new Scanner(System.in);

        // Prompt for rule input
        System.out.print("Enter a rule for evaluation (e.g., (age > 30 AND department = \"Sales\")): ");
        String ruleString = scanner.nextLine(); // Get input from user

        try {
            Node ast = creator.createRule(ruleString); // Create the AST from the rule string
            boolean result = evaluator.evaluateRule(ast, userData);
            System.out.println("Rule Evaluation Result: " + result);
        } catch (Exception e) {
            System.err.println("Error evaluating rule: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner resource
        }
    }
}
