import java.util.*;
public class NumberAnalysis {

    // Method to check whether the number is positive or negative
    public static boolean isPositive(double number) {
        return number >= 0;
    }

    // Method to check whether the number is even or odd
    public static boolean isEven(double number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(double number1, double number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];

        // Take user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        // Loop through the array and analyze each number
        for (double number : numbers) {
            if (isPositive(number)) {
                System.out.print("Positive ");
                if (isEven(number)) {
                    System.out.println("and even.");
                } else {
                    System.out.println("and odd.");
                }
            } else {
                System.out.println("Negative.");
            }
        }

        // Compare the first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        switch (comparisonResult) {
            case 1:
                System.out.println("The first number is greater than the last number.");
                break;
            case 0:
                System.out.println("The first number is equal to the last number.");
                break;
            case -1:
                System.out.println("The first number is less than the last number.");
                break;
        }

        input.close();
    }
}
