import java.util.Scanner;
import java.util.Arrays;

public class LargestElements2 {
    public static void main(String[] args) {
        // Create an input object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store the digits
        int maxDigits = 10;
        int[] digits = new int[maxDigits];
        int index = 0;

        // Loop to extract digits from the number
        while (number != 0) {
            if (index == maxDigits) {
                // Increase the size of the array
                maxDigits += 10;
                int[] temp = new int[maxDigits];
                // Copy current digits to temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                // Assign temp array to digits array
                digits = temp;
            }
            digits[index] = number % 10; // Store the last digit
            number = number / 10; // Remove the last digit
            index++;
        }

        // Variables to store the largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the largest and second largest digits
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // Close the input scanner
        input.close();
    }
}
