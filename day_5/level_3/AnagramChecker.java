import java.util.*;
public class AnagramChecker {

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        // Check if lengths of the texts are equal
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create arrays to store the frequency of characters
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Find the frequency of characters in the first text
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
        }

        // Find the frequency of characters in the second text
        for (int i = 0; i < text2.length(); i++) {
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency of characters in both texts
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first text: ");
        String text1 = input.nextLine();

        System.out.println("Enter the second text: ");
        String text2 = input.nextLine();

        // Check and display if the texts are anagrams
        boolean result = areAnagrams(text1, text2);
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        input.close(); // Close scanner
    }
}
