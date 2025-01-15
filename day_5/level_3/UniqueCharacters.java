import java.util.*;
public class UniqueCharacters {

    // Method to find the length of the text without using the String method length()
    public static int getTextLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception is used to determine the end of the string
        }
        return length;
    }

    // Method to find unique characters in the text
    public static char[] findUniqueCharacters(String text) {
        int length = getTextLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the current character is unique
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add it to the result array
            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        // Create a new array to store only the unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }

        return result;
    }

    // Method to display unique characters
    public static void displayUniqueCharacters(char[] uniqueChars) {
        System.out.println("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();

        // Find and display unique characters
        char[] uniqueChars = findUniqueCharacters(text);
        displayUniqueCharacters(uniqueChars);
		
		// Close scanner
		input.close();
    }
}
