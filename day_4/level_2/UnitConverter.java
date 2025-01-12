import java.util.*;
public class UnitConverter {

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }
	
	// Method To convert miles to kilometers and return the value
    public static double convertMilesToKm(double miles) {
        // Convert miles to km
        double miles2km = 1.60934;
        double km = miles * miles2km;

        // return the value
        return km;
    }
	
	// Method To convert meters to feet and return the value
    public static double convertMetersToFeet(double meters) {
        // Convert meter to feet
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;

        // return the value
        return feet;
    }
	
	// Method To convert feet to meters and return the value
    public static double convertFeetToMeters(double feet) {
        // Convert feet to meters
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;

        // return the value
        return meters;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
		
		// Take input for miles
        System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();
		
		// Take input for meters
        System.out.print("Enter the size in meters: ");
        double meters = sc.nextDouble();
		
		// Take input for feet
        System.out.print("Enter the size in feet: ");
        double feet = sc.nextDouble();

        // Call the method to convert km to miles
        double miles1 = convertKmToMiles(km); 

        // Display value in miles
        System.out.println("Distance in miles: " + miles1);
		
		// Call the method to convert miles to km
        double km1 = convertMilesToKm(miles); 

        // Display value in km
        System.out.println("Distance in km: " + km1);
		
		// Call the method to convert meters to feet
        double feet1 = convertMetersToFeet(meters); 

        // Display value in feet
        System.out.println("Size in feet: " + feet1);
		
		// Call the method to convert feet to meter
        double meters1 = convertFeetToMeters(feet); 

        // Display value in meters
        System.out.println("Size in meters: " + meters1);

        // Close Scanner
        sc.close();
    }
}
