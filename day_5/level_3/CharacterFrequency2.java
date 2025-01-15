import java.util.*;
public class CharacterFrequency {

    // Method to find the frequency of characters in the text
    public static int[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                frequency[i] = 1; // Initialize frequency
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0'; // Mark duplicate characters as '0'
                    }
                }
            }
        }

        return frequency;
    }

    // Method to create a 1D String array to store the characters and their frequencies
    public static String[][] createFrequencyArray(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = findCharacterFrequency(text);
        int uniqueCount = 0;

        // Count the number of unique characters
        for (char c : characters) {
            if (c != '0') {
                uniqueCount++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] frequencyArray = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                frequencyArray[index][0] = Character.toString(characters[i]);
                frequencyArray[index][1] = Integer.toString(frequency[i]);
                index++;
            }
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
        String[][] frequencyArray = createFrequencyArray(text);
        displayFrequencyArray(frequencyArray);

        input.close(); // Close scanner
    }
}
