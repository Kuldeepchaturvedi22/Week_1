import java.util.*;
public class NumberChecker1 {
    // Method to find the count of digits in the number
    public static int findCountOfDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigitsInArray(int number) {
        String numberStr = String.valueOf(number);
        int[] digitsArray = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digitsArray[i] = Character.getNumericValue(numberStr.charAt(i));
        }
        return digitsArray ;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int findSumOfDigits(int[] digitsArray) {
        int sum = 0;
        for (int digit : digitsArray) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static int findSumOfSquaresOfDigits(int[] digitsArray) {
        int sum = 0;
        for (int digit : digitsArray) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number using the digits array
    public static boolean isHarshadNumber(int number, int[] digitsArray) {
        int sumOfDigits = findSumOfDigits(digitsArray);
        return number % sumOfDigits == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] findDigitFrequency(int[] digitsArray) {
        int[][] frequencyArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequencyArray[i][0] = i;
            frequencyArray[i][1] = 0;
        }
        for (int digit : digitsArray) {
            frequencyArray[digit][1]++;
        }
        return frequencyArray;
    }

    public static void main(String[] args) {
        int number = 123456; // Example number

        int countOfDigits = findCountOfDigits(number);
        System.out.println("Count of digits: " + countOfDigits);

        int[] digitsArray = storeDigitsInArray(number);
        System.out.println("Digits array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int sumOfDigits = findSumOfDigits(digitsArray);
        System.out.println("Sum of digits: " + sumOfDigits);

        int sumOfSquaresOfDigits = findSumOfSquaresOfDigits(digitsArray);
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits);

        boolean isHarshad = isHarshadNumber(number, digitsArray);
        System.out.println("Is Harshad Number: " + isHarshad);

        int[][] digitFrequency = findDigitFrequency(digitsArray);
        System.out.println("Digit frequency:");
        for (int[] freq : digitFrequency) {
            System.out.println("Digit: " + freq[0] + " Frequency: " + freq[1]);
        }
    }
}
