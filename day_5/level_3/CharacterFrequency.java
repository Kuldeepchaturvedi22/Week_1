import java.util.*;
public class CharacterFrequency {

    // Method to find the frequency of characters in the text
    public static int[] findCharacterFrequency(String text) {
        int[] charFrequency = new int[256]; // Array to store character frequencies

        // Loop through the text to find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charFrequency[currentChar]++;
        }

        return charFrequency;
    }

    // Method to create a 2D array of characters and their frequencies
    public static String[][] createFrequencyArray(String text) {
        int[] charFrequency = findCharacterFrequency(text);
        int length = 0;

        // Calculate the length of the unique character list
        for (int frequency : charFrequency) {
            if (frequency > 0) {
                length++;
            }
        }

        // Create a 2D array to store characters and their frequencies
        String[][] frequencyArray = new String[length][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (charFrequency[i] > 0) {
                frequencyArray[index][0] = Character.toString((char) i);
                frequencyArray[index][1] = Integer.toString(charFrequency[i]);
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
