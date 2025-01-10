import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        // Array to hold 5 integers
        int[] numbers = new int[5];

        // Input object to take user input
        Scanner input = new Scanner(System.in);

        // Loop to get each number from the user
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Please enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Loop to analyze each number
        for (int number : numbers) {
            if (number > 0) {
                if (number % 2 == 0) {
                    System.out.println("Number " + number + " is positive and even.");
                } else {
                    System.out.println("Number " + number + " is positive and odd.");
                }
            } else if (number < 0) {
                System.out.println("Number " + number + " is negative.");
            } else {
                System.out.println("Number " + number + " is zero.");
            }
        }

        // Comparing the first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last numbers are the same.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first number is larger than the last number.");
        } else {
            System.out.println("The first number is smaller than the last number.");
        }

        // Close the input scanner
        input.close();
    }
}
