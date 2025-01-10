import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize isPrime to true
        boolean isPrime = true;
        
        // Check if the number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop through all numbers from 2 to the square root of the given number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                // Check if the number is divisible by i
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        // Print the result
        if (isPrime) {
            System.out.println("The number " + number + " is a prime number.");
        } else {
            System.out.println("The number " + number + " is not a prime number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
