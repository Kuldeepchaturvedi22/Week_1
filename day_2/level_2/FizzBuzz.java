import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a positive integer
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Check if the number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 1 to the user-entered number
            for (int i = 1; i <= number; i++) {
                // Check if the number is a multiple of both 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) { // Check if the number is a multiple of 3
                    System.out.println("Fizz");
                } else if (i % 5 == 0) { // Check if the number is a multiple of 5
                    System.out.println("Buzz");
                } else {
                    // Print the number if it is not a multiple of 3 or 5
                    System.out.println(i);
                }
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
