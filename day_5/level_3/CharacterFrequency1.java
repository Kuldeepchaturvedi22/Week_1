import java.util.*;
public class CharacterFrequency {
    
    // Method to find the unique characters in the text
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
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
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);

        return result;
    }

    // Method to find the frequency of characters in the text
    public static String[][] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; // Array to store character frequencies

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create a 2D array to store unique characters and their frequencies
        String[][] frequencyArray = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            frequencyArray[i][0] = Character.toString(uniqueChars[i]);
            frequencyArray[i][1] = Integer.toString(charFrequency[uniqueChars[i]]);
        }

        return frequencyArray;
    }

    // Method to display characters and their frequencies
    public static void displayFrequencyArray(String[][] frequencyArray) {
        System.out.println("Character\tFrequency");
        for (String[] entry : frequencyArray) {
            System.out.println(entry[0] + "\t\t" + entry[1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();

        // Find and display the frequency of characters
        String[][] frequencyArray = findCharacterFrequency(text);
        displayFrequencyArray(frequencyArray);

        input.close(); // Close scanner
    }
}
