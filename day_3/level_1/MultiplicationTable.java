import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create an input object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for an integer and store it in the number variable
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        // Array to store multiplication results from 1 to 10
        int[] results = new int[10];

        // Loop to calculate and store multiplication results
        for (int i = 0; i < 10; i++) {
            results[i] = number * (i + 1);
        }

        // Display the results in the format number * i = ___
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + results[i]);
        }

        // Close the input scanner
        input.close();
    }
}
