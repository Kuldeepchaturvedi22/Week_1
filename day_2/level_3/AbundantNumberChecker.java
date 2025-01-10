import java.util.Scanner;

public class AbundantNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get an integer input for the number variable
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Create an integer variable sum with initial value 0
        int sum = 0;
        
        // Run a for loop from i = 1 to i < number
        for (int i = 1; i < number; i++) {
            // Check if the number is divisible by i
            if (number % i == 0) {
                // If true, add i to sum
                sum += i;
            }
        }
        
        // Check if the sum is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is Not an Abundant Number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
