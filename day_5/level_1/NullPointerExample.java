import java.util.*;
public class NullPointerExample {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This will throw NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public static void handleException() {
        String text = null;
        try {
            // Attempt to call a method on null, which will throw NullPointerException
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Generate the NullPointerException
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Generated NullPointerException: " + e.getMessage());
        }

        // Handle the NullPointerException
        handleException();
    }
}
