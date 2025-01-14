import java.util.*;
public class StringIndexOutOfBoundsExample {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException() {
        String text = "null";
        // This will throw StringIndexOutOfBoundsException
        System.out.println(text.charAt(4));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException() {
        String text = "null";
        try {
            // Attempt to call a method on null, which will throw StringIndexOutOfBoundsException
            System.out.println(text.charAt(4));
        } catch (StringIndexOutOfBoundsException e) {
            // Handling the exception
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Generate the StringIndexOutOfBoundsException
        try {
            generateException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Generated StringIndexOutOfBoundsException: " + e.getMessage());
        }

		// Handle the StringIndexOutOfBoundsException
        handleException();
    }
}
