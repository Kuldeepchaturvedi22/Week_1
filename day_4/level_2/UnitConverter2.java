import java.util.*;
public class UnitConverter2 {

    // Method to convert yards to feet and return the value
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards and return the value
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches and return the value
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters and return the value
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters and return the value
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for yards
        System.out.print("Enter the distance in yards: ");
        double yards = sc.nextDouble();

        // Take input for feet
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();

        // Take input for meters
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();

        // Take input for inches
        System.out.print("Enter the distance in inches: ");
        double inches = sc.nextDouble();

        // Convert yards to feet and display the value
        System.out.println("Distance in feet: " + convertYardsToFeet(yards));

        // Convert feet to yards and display the value
        System.out.println("Distance in yards: " + convertFeetToYards(feet));

        // Convert meters to inches and display the value
        System.out.println("Distance in inches: " + convertMetersToInches(meters));

        // Convert inches to meters and display the value
        System.out.println("Distance in meters: " + convertInchesToMeters(inches));

        // Convert inches to centimeters and display the value
        System.out.println("Distance in centimeters: " + convertInchesToCentimeters(inches));

        // Close Scanner
        sc.close();
    }
}
