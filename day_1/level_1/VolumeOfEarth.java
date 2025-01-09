// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the VolumeOfEarth class, which will calculate and display the volume of Earth in cubic kilometers and cubic miles
public class VolumeOfEarth { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Defines the radius of the Earth in kilometers
        double earthRadiusKm = 6375; 
        // Conversion factor from kilometers to miles
        double kmToMile = 0.621371; 
        // Converts the Earth's radius from kilometers to miles
        double earthRadiusMile = earthRadiusKm * kmToMile; 
        // Defines the value of pi
        double pi = Math.PI; 
        // Calculates the volume of the Earth in cubic kilometers using the formula for the volume of a sphere
        double volumeOfEarthInKm = (4.0 / 3.0) * pi * Math.pow(earthRadiusKm, 3); 
        // Calculates the volume of the Earth in cubic miles using the formula for the volume of a sphere
        double volumeOfEarthInMiles = (4.0 / 3.0) * pi * Math.pow(earthRadiusMile, 3); 
        // Prints the volume of the Earth in cubic kilometers and cubic miles to the console
        System.out.println("The volume of earth in cubic kilometers is " + volumeOfEarthInKm + " and cubic miles is " + volumeOfEarthInMiles); 
    }
}
