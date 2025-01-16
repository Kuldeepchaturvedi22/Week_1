import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read three integer inputs from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Close the Scanner object
        scanner.close();

        // Find the maximum of the three numbers
        int maxNumber = findMax(num1, num2, num3);
        
        // Print the result
        System.out.println("The maximum of the three numbers is: " + maxNumber);
    }

    // Function to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        int max = a; // Assume 'a' is the largest

        // Compare 'b' with 'max'
        if (b > max) {
            max = b;
        }

        // Compare 'c' with 'max'
        if (c > max) {
            max = c;
        }

        return max; // Return the largest value
    }
}