import java.util.*;
public class UpperCaseCompare {

    // Method to convert each character to uppercase using charAt()
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
	
		// Created scanner object for taking input from user
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the text:");
        String text = input.nextLine();

        // Converting to uppercase using custom method and built-in method
        String upperCaseCustom = toUpperCaseCustom(text);
        String upperCaseBuiltIn = text.toUpperCase();

        // Comparing the two strings
        boolean areEqual = compareStrings(upperCaseCustom, upperCaseBuiltIn);

        // Displaying the results
        System.out.println("Text in uppercase (custom method): " + upperCaseCustom);
        System.out.println("Text in uppercase (built-in method): " + upperCaseBuiltIn);
        System.out.println("Are the results equal? " + areEqual);

		// Close scanner
        input.close();
    }
}
