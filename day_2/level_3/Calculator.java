import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get input values for the two double variables named first and second
        System.out.print("Enter the first number: ");
        double first = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double second = scanner.nextDouble();
        
        // Get input value for the operator (op)
        System.out.print("Enter an operator (+, -, *, /): ");
        String op = scanner.next();
        
        // Perform specific operations based on the input value of the op using the switch statement
        switch (op) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                // Check for division by zero
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                // If the operator is neither of those 4 values, print Invalid Operator
                System.out.println("Invalid Operator.");
                break;
        }
        
        // Close the scanner
        scanner.close();
    }
}
