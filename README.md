# Rule Engine with AST

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

1. **Clone the repository**:

   ```bash
   git clone https://github.com/ghv061101/Rule-Engine-with-AST.git
   cd Rule-Engine-with-AST

### project setup
   -ast/
    -Node.java
    -UserData.java
    -RuleCreator.java
    -RuleEvaluator.java
    -RuleModifier.java
    -Main.java

   input example
   
   Enter a rule for evaluation (e.g., (age > 30 AND department = "Sales")): 
   
   ((age > 30 AND department = "Sales"))
   
   output
   
   Rule Evaluation Result: true
   
