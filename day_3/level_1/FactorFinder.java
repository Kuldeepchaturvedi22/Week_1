import java.util.Scanner;
import java.util.Arrays;

public class FactorFinder {
    public static void main(String[] args) {
        // Create an input object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        // Initialize variables
        int maxFactors = 10;
        int[] factors = new int[maxFactors];
        int index = 0;

        // Loop through numbers from 1 to the given number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // If the index reaches maxFactors, resize the factors array
                if (index == maxFactors) {
                    maxFactors *= 2;
                    factors = Arrays.copyOf(factors, maxFactors);
                }
                // Add the factor to the array and increment the index
                factors[index] = i;
                index++;
            }
        }

        // Display the factors of the number
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // Close the input scanner
        input.close();
    }
}
