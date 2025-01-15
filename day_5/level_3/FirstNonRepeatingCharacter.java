import java.util.*;
public class FirstNonRepeatingCharacter {

    // Method to find the first non-repeating character in the text
    public static char findFirstNonRepeatingCharacter(String text) {
        int[] charFrequency = new int[256]; // Array to store character frequencies

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        // Loop through the text to find the first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (charFrequency[currentChar] == 1) {
                return currentChar;
            }
        }

        // Return a placeholder if no non-repeating character is found
        return '\0'; // Null character
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String text = input.nextLine();

        // Find and display the first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);
        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }
		
		// Close scanner
		input.close();
    }
}
