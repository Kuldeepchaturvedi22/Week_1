import java.util.Scanner;

public class FactorialCalculatorForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Initialize the factorial variable to 1
            int factorial = 1;
            
            // Compute the factorial using a for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            // Print the factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        
        // Close the scanner
        scanner.close();
    }
}
