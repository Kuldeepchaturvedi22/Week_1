import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get an integer input for the number variable
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Create an integer variable sum with initial value 0
        int sum = 0;
        int originalNumber = number;
        
        // Create a while loop to access each digit of the number
        while (originalNumber != 0) {
            // Find the remainder (last digit) using the modulus operator
            int digit = originalNumber % 10;
            
            // Add each digit of the number to sum
            sum += digit;
            
            // Remove the last digit from the number
            originalNumber /= 10;
        }
        
        // Check if the number is perfectly divisible by the sum
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
