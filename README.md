

### README.md

```markdown
# Rule Engine

This project implements a simple rule engine in Java that allows users to define and evaluate rules against user data. The engine uses an Abstract Syntax Tree (AST) to represent rules and evaluates them based on user-defined attributes.

## Features

- Define rules using logical operators (AND, OR).
- Evaluate rules against user attributes such as age, department, salary, and experience.
- Simple AST implementation to parse and evaluate rules.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse)

### Setup

1. **Clone the repository** or download the files into a local directory.
   
   ```bash
   git clone <https://github.com/ghv061101/Rule-Engine-with-AST.git>
   cd <project-directory>
   ```

2. **Create a package structure** that matches the class files:

   ```
   ast/
       Node.java
       UserData.java
       RuleCreator.java
       RuleEvaluator.java
       RuleModifier.java
       Main.java
   ```

3. **Compile the project** using the command line or your IDE. If using the command line, navigate to the project directory and run:

   ```bash
   javac ast/*.java
   ```

4. **Run the program**:

   ```bash
   java ast.Main
   ```

## Usage

When you run the program, you will be prompted to enter a rule for evaluation. The rule should be in the following format:

```
(attribute operator value)
```

### Example Rules

- **Example 1**:
   ```
   Enter a rule for evaluation (e.g., (age > 30 AND department = "Sales")): ((age > 30 AND department = "Sales"))
   ```
   **Output**:
   ```
   Rule Evaluation Result: true
   ```

- **Example 2**:
   ```
   Enter a rule for evaluation (e.g., (age > 30 AND department = "Sales")): ((age < 30 OR department = "Marketing"))
   ```
   **Output**:
   ```
   Rule Evaluation Result: false
   ```


```
