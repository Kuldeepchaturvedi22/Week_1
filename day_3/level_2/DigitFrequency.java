import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        // Create an input object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the count of digits in the number and store them in an array
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        // Find the digits in the number and save them in an array
        int[] digits = new int[count];
        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number = number / 10;
        }

        // Define a frequency array of size 10
        int[] frequency = new int[10];

        // Loop through the digits array and increase the frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display the frequency of each digit in the number
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        // Close the input scanner
        input.close();
    }
}
