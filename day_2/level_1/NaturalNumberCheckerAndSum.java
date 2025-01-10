import java.util.Scanner;

public class NaturalNumberCheckerAndSum {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a natural number (positive integer or 0)
        if (number >= 0) {
            // Calculate the sum of the first n natural numbers
            int sum = number * (number + 1) / 2;
            System.out.println("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
