import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the total variable
        double total = 0.0;
        
        // Variable to store the user's input
        double userInput;
        
        // Prompt the user to enter a number
        System.out.print("Enter a number (0 to end): ");
        userInput = scanner.nextDouble();
        
        // Use a while loop to keep asking for numbers until the user enters 0
        while (userInput != 0) {
            // Add the user input to the total
            total += userInput;
            
            // Prompt the user to enter another number
            System.out.print("Enter a number (0 to end): ");
            userInput = scanner.nextDouble();
        }
        
        // Display the total value
        System.out.println("The total sum is " + total);
        
        // Close the scanner
        scanner.close();
    }
}
