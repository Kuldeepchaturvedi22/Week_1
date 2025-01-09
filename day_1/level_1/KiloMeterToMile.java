// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the KiloMeterToMile class, which will convert a user-entered distance in kilometers to miles
public class KiloMeterToMile { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Creates a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); 
        // Prompts the user to enter the distance in kilometers
        System.out.println("Enter Distance in Km :"); 
        // Reads the user input for distance in kilometers
        double km = sc.nextDouble(); 
        // Converts the distance from kilometers to miles using the conversion factor
        double kmToMile = (double) km * 0.621371; 
        // Prints the converted distance in miles to the console
        System.out.println("The total miles is " + kmToMile + " mile for the given " + km + " km"); 
    }
}
