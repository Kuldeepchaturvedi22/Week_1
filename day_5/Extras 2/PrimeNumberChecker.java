import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read the number input from the user
        System.out.print("Enter a number to check if it is prime: ");
        int number = scanner.nextInt();
        
        // Close the Scanner object
        scanner.close();

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);
        
        // Print the result
        displayResult(number, isPrime);
    }

    // Function to check if a number is prime
    public static boolean isPrimeNumber(int num) {
        // Handle edge cases
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number other than 1 and itself, it is not prime
            }
        }
        return true; // If no divisors found, it is prime
    }

    // Function to display the result
    public static void displayResult(int number, boolean isPrime) {
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}