import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        double result;

        // Perform the chosen operation
        switch (operation.toLowerCase()) {
            case "add":
                result = add(num1, num2);
                break;
            case "subtract":
                result = subtract(num1, num2);
                break;
            case "multiply":
                result = multiply(num1, num2);
                break;
            case "divide":
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation. Please choose add, subtract, multiply, or divide.");
                scanner.close();
                return; // Exit the program for invalid operation
        }

        // Display the result
        System.out.println("The result is: " + result);

        // Close the Scanner object
        scanner.close();
    }

    // Method to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method to subtract the second number from the first
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method to divide the first number by the second
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
    }
}