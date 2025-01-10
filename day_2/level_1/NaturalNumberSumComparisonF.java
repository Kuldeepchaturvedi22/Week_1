import java.util.Scanner;

public class NaturalNumberSumComparisonF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is a natural number (0 or positive integer)
        if (number >= 0) {
            // Calculate the sum using the formula
            int formulaSum = number * (number + 1) / 2;
            
            // Calculate the sum using the for-loop
            int loopSum = 0;
            for (int i = 1; i <= number; i++) {
                loopSum += i;
            }
            
            // Print the results
            System.out.println("The sum of " + number + " natural numbers using the formula is " + formulaSum);
            System.out.println("The sum of " + number + " natural numbers using the for-loop is " + loopSum);
            
            // Compare the results
            if (formulaSum == loopSum) {
                System.out.println("Both results are correct.");
            } else {
                System.out.println("There is a discrepancy between the results.");
            }
        } else {
            System.out.println("The number " + number + " is not a natural number.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
