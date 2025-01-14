import java.util.*;
public class CompleteLowerCaseCompare {

    // Method to convert each character to lowercase using charAt()
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

        // Converting to lowercase using custom method and built-in method
        String lowerCaseCustom = toLowerCaseCustom(text);
        String lowerCaseBuiltIn = text.toLowerCase();

        // Comparing the two strings
        boolean areEqual = compareStrings(lowerCaseCustom, lowerCaseBuiltIn);

        // Displaying the results
        System.out.println("Text in lowercase (custom method): " + lowerCaseCustom);
        System.out.println("Text in lowercase (built-in method): " + lowerCaseBuiltIn);
        System.out.println("Are the results equal? " + areEqual);

		// Close scanner
        input.close();
    }
}
