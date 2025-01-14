import java.util.*;
public class NumberFormatExample {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        // This will throw NumberFormatException
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {
        try {
            // Attempt to parse the text, which will throw NumberFormatException
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handling the NumberFormatException
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handling any other RuntimeException
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a string:");
        String text = input.next();

        // Generate the NumberFormatException
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Generated NumberFormatException: " + e.getMessage());
        }

        // Handle the NumberFormatException
        handleException(text);

        input.close();
    }
}
