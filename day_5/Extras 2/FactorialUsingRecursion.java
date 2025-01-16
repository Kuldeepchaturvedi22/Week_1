import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        // Get the input number from the user
        int number = readInputNumber();
        
        // Compute the factorial using recursion
        long factorial = computeFactorial(number);
        
        // Print the result
        printResult(number, factorial);
    }

    // Method to read the input number from the user
    public static int readInputNumber() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        // Close the Scanner object
        scanner.close();
        return number;
    }

    // Recursive method to compute the factorial of a number
    public static long computeFactorial(int num) {
        if (num <= 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        return num * computeFactorial(num - 1); // Recursive case
    }

    // Method to print the result
    public static void printResult(int number, long factorial) {
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}