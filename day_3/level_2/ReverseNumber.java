import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create an input object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the count of digits in the number
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

        // Create an array to store the elements of the digits array in reverse order
        int[] reversedDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reversedDigits[i] = digits[count - 1 - i];
        }

        // Display the elements of the array in reverse order
        System.out.println("Digits of the number in reverse order:");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Close the input scanner
        input.close();
    }
}
