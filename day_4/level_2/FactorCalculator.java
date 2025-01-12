import java.util.*;
public class FactorCalculator {
    // Method to find and return the factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number%i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the sum of the factors
    public static int findSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors
    public static long findProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the sum of squares of the factors
    public static double findSumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    public static void main(String[] args) {
	
		// Used scanner class to take input from user
        Scanner input = new Scanner(System.in);
		
		// Prompt for taking input from user
        System.out.println("Enter a number:");
        int number = input.nextInt();

		// Created an array whose name is factors
        int[] factors = findFactors(number);
		
		// Print all factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
		// Use print stream for new line
        System.out.println();
		
		// Store the sum of all factors by calling findsum method
        int sum = findSum(factors);
		
		// Use product variable to store product of all factors
        long product = findProduct(factors);
		
		// Used sumOfSquares variable to store sum of square of all factors
        double sumOfSquares = findSumOfSquares(factors);
		
		// Output result
        System.out.println("Sum of factors: " + sum + " Product of factors: " + product + " Sum of squares of factors: " + sumOfSquares);
        
		// Close scanner 
        input.close();
    }
}
