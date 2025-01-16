import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Read the input string from the user
        String inputString = getInputString();
        
        // Check if the input string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);
        
        // Display the result
        displayResult(inputString, isPalindrome);
    }

    // Function to read the input string from the user
    public static String getInputString() {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String inputString = scanner.nextLine();
        // Close the Scanner object
        scanner.close();
        return inputString;
    }

    // Function to check if a given string is a palindrome
    public static boolean checkPalindrome(String str) {
        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = cleanedString.length() - 1;
        
        // Check characters from both ends
        while (left < right) {
            if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Function to display the result
    public static void displayResult(String inputString, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }
    }
}