import java.util.*;
public class RandomFourDigit {

    // Method to generate an array of 4-digit random numbers given the size as a parameter
    public static int[] generate4DigitRandomArray(int size) {
        // Created an object of Random class
        Random random = new Random();

        // Created an array to store 4-digit random numbers
        int[] array4Random = new int[size];

        // Loop through array4Random to generate random 4-digit numbers
        for (int i = 0; i < size; i++) {
            array4Random[i] = 1000 + random.nextInt(9000); // Generates a random number between 1000 and 9999
        }

        return array4Random;
    }

    // Method to find the average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the numbers to calculate sum, min, and max
        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        double average = (double) sum / numbers.length;

        // Store average, min, and max in an array
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        // Generate five 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find the average, min, and max value of the generated numbers
        double[] results = findAverageMinMax(randomNumbers);

        // Print the generated numbers
        System.out.println("Generated 4-digit random numbers: ");
        for (int number : randomNumbers) {
            System.out.println(number);
        }

        // Output the result
        System.out.println("Average: " + results[0] + " Min: " + results[1] + " Max: " + results[2]);
        System.out.println("Min: " + results[1]);
        System.out.println("Max: " + results[2]);
    }
}
