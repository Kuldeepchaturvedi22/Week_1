import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        // Input object for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for an integer and store it in the variable number
        System.out.print("Please enter a number: ");
        int number = input.nextInt();

        // Array to store multiplication results
        int[] results = new int[4];

        // Loop to calculate the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            results[i - 6] = number * i;
        }

        // Display the results in the format number * i = ___
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + results[i - 6]);
        }

        // Close the input scanner
        input.close();
    }
}
