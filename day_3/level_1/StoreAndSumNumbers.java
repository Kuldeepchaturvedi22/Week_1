import java.util.Scanner;

public class StoreAndSumNumbers {
    public static void main(String[] args) {
        // Array to store up to 10 double values
        double[] numbers = new double[10];
        double sum = 0.0;
        int index = 0;

        // Input object for user input
        Scanner input = new Scanner(System.in);

        // Loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            // Check if the user entered 0 or a negative number
            if (number <= 0) {
                break;
            }

            // Store the number in the array and increment the index
            numbers[index] = number;
            index++;

            // Break the loop if the array is full
            if (index == 10) {
                break;
            }
        }

        // Display all the numbers and calculate the total sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }

        // Display the total sum of numbers
        System.out.println("Total sum of numbers: " + sum);

        // Close the input scanner
        input.close();
    }
}
