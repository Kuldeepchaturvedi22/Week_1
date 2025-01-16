import java.util.*;
class CountVowelsAndConsonants2D {
    
    // Method to check if the character is a vowel, consonant or not a letter
    public static String checkCharType(char ch) {
        ch = (char) ((ch >= 'A' && ch <= 'Z') ? ch + 32 : ch); // Convert to lowercase if uppercase
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    
    // Method to find vowels and consonants in a string using charAt() method
    public static String[][] findVowelsAndConsonants(String text) {
        int length = text.length();
        String[][] result = new String[length][2];
        
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        
        return result;
    }
    
    // Method to display the 2D Array of Strings in a Tabular Format
    public static void display2DArray(String[][] array) {
        System.out.printf("%-10s%-20s%n", "Character", "Type");
        System.out.println("---------------------------------");
        for (String[] row : array) {
            System.out.printf("%-10s%-20s%n", row[0], row[1]);
        }
    }
    
    public static void main(String[] args) {
        // Created scanner object to take input from user
        Scanner input = new Scanner(System.in);
        
        // Prompt for taking input from user
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        
        // Find vowels and consonants
        String[][] result = findVowelsAndConsonants(string);
        
        // Display the result in tabular format
        display2DArray(result);
        
        // Close scanner
        input.close();
    }
}
