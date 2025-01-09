// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the KmToMiles class, which will convert a distance in kilometers to miles
public class KmToMiles { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Defines the distance in kilometers to be converted
        double kiloMeter = 10.8; 
        // Converts the distance from kilometers to miles (assuming 1 km = 1.6 miles)
        double kmToMiles = 10.8 * 1.6; 
        // Prints the converted distance to the console
        System.out.println("The distance " + kiloMeter + " km in miles is " + kmToMiles); 
    }
}
