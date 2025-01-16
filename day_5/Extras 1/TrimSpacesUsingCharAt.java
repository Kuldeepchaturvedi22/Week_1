import java.util.*;
class TrimSpacesUsingCharAt {

    // Method to trim leading and trailing spaces from a string using charAt() method
    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        // Return start and end indexes
        return new int[]{start, end};
    }

    // Method to create a substring using charAt() method
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
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
	
        // Create scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Prompt for taking input from user
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        // Find trim indexes using custom method
        int[] indexes = findTrimIndexes(string);
        String trimmedStringCustom = customSubstring(string, indexes[0], indexes[1]);

        // Trim spaces using built-in trim() method
        String trimmedStringBuiltIn = string.trim();

        // Compare the two strings
        boolean areEqual = compareStrings(trimmedStringCustom, trimmedStringBuiltIn);

        // Display the result
        System.out.println("Custom trim method result: '" + trimmedStringCustom + "'");
        System.out.println("Built-in trim method result: '" + trimmedStringBuiltIn + "'");
        System.out.println("Are the two methods producing the same result? " + areEqual);

        // Close scanner
        input.close();
    }
}
