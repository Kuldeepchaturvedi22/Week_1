import java.util.*;
public class NumberChecker {

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
        return digitsArray;
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digitsArray) {
        for (int digit : digitsArray) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number using the digits array
    public static boolean isArmstrongNumber(int number, int[] digitsArray) {
        int sum = 0;
        for (int digit : digitsArray) {
            sum += Math.pow(digit, digitsArray.length);
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digitsArray) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digitsArray) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int [] digitsArray) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digitsArray) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // Example number

        int countOfDigits = findCountOfDigits(number);
        System.out.println("Count of digits: " + countOfDigits );

        int[] digitsArray = storeDigitsInArray(number);
        System.out.println("Digits array: ");
        for (int digit: digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        boolean isDuck = isDuckNumber(digitsArray);
        System.out.println("Is Duck Number: " + isDuck);

        boolean isArmstrong = isArmstrongNumber(number, digitsArray);
        System.out.println("Is Armstrong Number: " + isArmstrong);

        int[] largestAndSecondLargest = findLargestAndSecondLargest(digitsArray);
        System.out.println("Largest: " + largestAndSecondLargest [0]);
        System.out.println("Second Largest: " + largestAndSecondLargest[1]);

        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digitsArray);
        System.out.println("Smallest: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest: " + smallestAndSecondSmallest[1]);
    }
}
