// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the ConvertHeight class, which will convert a user-entered height from centimeters to feet and inches
public class ConvertHeight { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Creates a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); 
        // Prompts the user to enter their height in centimeters
        System.out.println("Enter Your Height in CM :"); 
        // Reads the user input for height in centimeters
        double height = sc.nextDouble(); 
        // Converts the height from centimeters to inches using the conversion factor
        double cmToInch = height * 0.3937; 
        // Converts the height from centimeters to feet using the conversion factor
        double cmToFeet = height * 0.0328084; 
        // Prints the height in centimeters, feet, and inches to the console
        System.out.println("Your Height in cm is " + height + " while in feet is " + cmToFeet + " and inches is " + cmToInch); 
    }
}
