import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get integer input and store it in the number variable
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define sum variable, initialize it to zero, and define originalNumber variable
        int sum = 0;
        int originalNumber = number;
        
        // Use the while loop till the originalNumber is not equal to zero
        while (originalNumber != 0) {
            // Find the remainder (last digit) using the modulus operator
            int remainder = originalNumber % 10;
            
            // Find the cube of the remainder and add it to the sum variable
            sum += Math.pow(remainder, 3);
            
            // Find the quotient of the number and assign it to the originalNumber
            originalNumber /= 10; // This removes the last digit of the original number
        }
        
        // Check if the number and the sum are the same
        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
