import java.util.*;
public class SubstringCompare {

    // Method to create a substring using charAt() method
    public static String createSubstring(String text, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
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
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the string:");
        String text = scanner.next();

        System.out.println("Enter the start index:");
        int startIndex = scanner.nextInt();

        System.out.println("Enter the end index:");
        int endIndex = scanner.nextInt();

        // Creating substrings using charAt() method and built-in method
        String substringCharAt = createSubstring(text, startIndex, endIndex);
        String substringBuiltIn = text.substring(startIndex, endIndex);

        // Comparing the substrings
        boolean areEqual = compareStrings(substringCharAt, substringBuiltIn);

        // Displaying the result
        System.out.println("Substring using charAt(): " + substringCharAt);
        System.out.println("Substring using built-in method: " + substringBuiltIn);
        System.out.println("Are the substrings equal? " + areEqual);

        scanner.close();
    }
}
