import java.util.Scanner;

public class FactorFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the input value for the variable named number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Print the factors of the number
        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                // Print the value of i
                System.out.println(i);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
