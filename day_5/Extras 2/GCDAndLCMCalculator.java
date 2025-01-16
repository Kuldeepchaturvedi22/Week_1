import java.util.Scanner;

public class GCDAndLCMCalculator {

    public static void main(String[] args) {
        // Read two integer inputs from the user
        int num1 = getInputNumber("Enter the first number: ");
        int num2 = getInputNumber("Enter the second number: ");
        
        // Calculate the GCD of the two numbers
        int gcd = calculateGCD(num1, num2);
        
        // Calculate the LCM of the two numbers
        int lcm = calculateLCM(num1, num2, gcd);
        
        // Display the results
        displayResult("GCD", num1, num2, gcd);
        displayResult("LCM", num1, num2, lcm);
    }

    // Function to read an input number from the user
    public static int getInputNumber(String prompt) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        int number = scanner.nextInt();
        // Close the Scanner object after use
        // scanner.close();  // Keep it open until all inputs are read to prevent closing System.in prematurely
        return number;
    }

    // Function to calculate the GCD of two numbers
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the LCM of two numbers
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    // Function to display the result
    public static void displayResult(String type, int num1, int num2, int result) {
        System.out.println(type + " of " + num1 + " and " + num2 + " is: " + result);
    }
}