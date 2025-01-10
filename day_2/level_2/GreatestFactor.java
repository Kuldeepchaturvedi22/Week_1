import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Initialize the greatest factor variable
        int greatestFactor = 1;
        
        // Loop from number - 1 to 1 to find the greatest factor
        for (int i = number - 1; i >= 1; i--) {
            // Check if the number is perfectly divisible by i
            if (number % i == 0) {
                greatestFactor = i;
                break; // Exit the loop once the greatest factor is found
            }
        }
        
        // Display the greatest factor
        System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
        
        // Close the scanner
        scanner.close();
    }
}
