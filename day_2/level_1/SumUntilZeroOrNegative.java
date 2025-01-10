import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize the total variable
        double total = 0.0;
        
        // Variable to store the user's input
        double userInput;
        
        // Use an infinite while loop
        while (true) {
            // Prompt the user to enter a number
            System.out.print("Enter a number (0 or negative to end): ");
            userInput = scanner.nextDouble();
            
            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break; // Exit the loop
            }
            
            // Add the user input to the total
            total += userInput;
        }
        
        // Display the total value
        System.out.println("The total sum is " + total);
        
        // Close the scanner
        scanner.close();
    }
}
