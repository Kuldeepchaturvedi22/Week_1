import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get integer input for the number and power
        System.out.print("Enter the base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        
        // Initialize the result variable to 1
        int result = 1;
        
        // Run a for loop from i = 1 to i <= power
        for (int i = 1; i <= power; i++) {
            // Multiply the result with the number in each iteration
            result *= number;
        }
        
        // Print the result
        System.out.println(number + " raised to the power of " + power + " is " + result);
        
        // Close the scanner
        scanner.close();
    }
}
