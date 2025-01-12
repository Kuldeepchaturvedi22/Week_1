public class NumberChecker2 {

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

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digitsArray) {
        int[] reversedArray = new int[digitsArray.length];
        for (int i = 0; i < digitsArray.length; i++) {
            reversedArray[i] = digitsArray[digitsArray.length - 1 - i];
        }
        return reversedArray;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true ;
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digitsArray) {
        int[] reversedArray = reverseDigitsArray(digitsArray);
        return areArraysEqual(digitsArray, reversedArray);
    }

    // Method to check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digitsArray) {
        for (int digit : digitsArray) {
            if (digit == 0) {
                return true ;
            }
        }
        return false ;
    }

    public static void main(String[] args) {
        int number = 12321; // Example number

        int countOfDigits = findCountOfDigits(number);
        System.out.println("Count of digits: " + countOfDigits);

        int[] digitsArray = storeDigitsInArray(number);
        System.out.println("Digits array: ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] reversedArray = reverseDigitsArray(digitsArray);
        System.out.println("Reversed digits array: ");
        for (int digit: reversedArray) {
            System.out.print(digit + " ");
        }
        System.out.println();

        boolean arraysEqual = areArraysEqual(digitsArray, reversedArray);
        System.out.println("Are original and reversed arrays equal: " + arraysEqual);

        boolean isPalindrome = isPalindrome(digitsArray);
        System.out.println("Is Palindrome: " + isPalindrome);

        boolean isDuck = isDuckNumber(digitsArray);
        System.out.println("Is Duck Number: " + isDuck);
    }
}
