import java.util.*;
public class PalindromeChecker {

    // Logic 1: Check if the text is a palindrome by comparing characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Check if the text is a palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Check if the text is a palindrome using character arrays
    public static boolean isPalindromeUsingArrays(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse a string using charAt() method
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        int end = text.length() - 1;

        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(end - i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();

        // Check and display if the text is a palindrome using three logics
        boolean iterativeResult = isPalindromeIterative(text);
        boolean recursiveResult = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean arrayResult = isPalindromeUsingArrays(text);

        System.out.println("Is the text a palindrome (Iterative)? " + iterativeResult);
        System.out.println("Is the text a palindrome (Recursive)? " + recursiveResult);
        System.out.println("Is the text a palindrome (Arrays)? " + arrayResult);

        input.close(); // Close scanner
    }
}
