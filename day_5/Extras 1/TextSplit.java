import java.util.*;
public class TextSplit {

    // Method to split the text into words without using the split() method
    public static String[] splitTextIntoWords(String text) {
        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if (word.length() > 0) {
                    words.add(word.toString());
                    word.setLength(0);
                }
            } else {
                word.append(ch);
            }
        }
        if (word.length() > 0) {
            words.add(word.toString());
        }
        return words.toArray(new String[0]);
    }

    // Method to find and return the length of a string without using the length() method
    public static int getLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array with words and their corresponding lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the text:");
        String text = input.nextLine();

        // Splitting text into words
        String[] words = splitTextIntoWords(text);

        // Getting words and their lengths in a 2D array
        String[][] wordsAndLengths = getWordsAndLengths(words);

        // Displaying the results in a tabular format
        System.out.println("Word\tLength");
        for (String[] wordAndLength : wordsAndLengths) {
            System.out.println(wordAndLength[0] + "\t" + Integer.parseInt(wordAndLength[1]));
        }

        input.close();
    }
}
