import java.util.*;
public class IllegalArgumentExample {

    // Method to generate IllegalArgumentException
    public static void generateException(String value) {
        // This will throw IllegalArgumentException because start index is greater than end index
        String text = value.substring(value.length()-1,1);
        System.out.println(text);
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String value) {
        try {
            // Attempt to call a method, which will throw IllegalArgumentException
            String text = value.substring(value.length()-1,1);
            System.out.println(text);
        } catch (IllegalArgumentException e) {
            // Handling the IllegalArgumentException
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handling any other RuntimeException
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a string:");
        String value = input.next();

        // Generate the IllegalArgumentException
        try {
            generateException(value);
        } catch (Exception e) {
            System.out.println("Generated IllegalArgumentException: " + e.getMessage());
        }

        // Handle the IllegalArgumentException
        handleException(value);

        input.close();
    }
}
