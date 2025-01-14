import java.util.*;
public class ArrayIndexOutOfBoundsExample {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(int [] names,int length) {
        // This will throw ArrayIndexOutOfBoundsException
        System.out.println(names[length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(int [] names,int length) {
        try {
            // Attempt get get index which is greter then array length, which will throw ArrayIndexOutOfBoundsException
            System.out.println(names[length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the ArrayIndexOutOfBoundsException
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handling any other RuntimeException
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
	
		// Created scanner object for taking input from user
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.println("Enter a length of an array:");
        int length = input.nextInt();
		
		// Created array to store input from user
		System.out.println("Enter a value of an array:");
		int [] names = new int[length];

		for(int i=0;i<length;i++){
			names[i] = input.nextInt();
		}

        // Generate the ArrayIndexOutOfBoundsException
        try {
            generateException(names,length);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Generated ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // Handle the NumberFormatException
        handleException(names,length);

		// Close scanner
        input.close();
    }
}
