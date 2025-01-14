import java.util.*;
public class CharArrayCompare {

    // Method to return characters in a string without using toCharArray()
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter the string:");
        String text = input.next();

        // Getting characters using user-defined method and built-in method
        char[] charactersCustom = getCharacters(text);
        char[] charactersBuiltIn = text.toCharArray();

        // Comparing the character arrays
        boolean areEqual = compareCharArrays(charactersCustom, charactersBuiltIn);

        // Displaying the result
        System.out.println("Characters using user-defined method: " + Arrays.toString(charactersCustom));
        System.out.println("Characters using built-in method: " + Arrays.toString(charactersBuiltIn));
        System.out.println("Are the character arrays equal? " + areEqual);

        input.close();
    }
}
