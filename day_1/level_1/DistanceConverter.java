import java.util.*;
public class DistanceConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Conversion factors
        double FEET_TO_YARDS = 1.0 / 3.0;
        double YARDS_TO_MILES = 1.0 / 1760.0;

        // Convert feet to yards
        double distanceInYards = distanceInFeet * FEET_TO_YARDS;

        // Convert yards to miles
        double distanceInMiles = distanceInYards * YARDS_TO_MILES;

        // Print the results
        System.out.println("The distance in yards is " + distanceInYards);
        System.out.println("The distance in miles is " + distanceInMiles);
    }
}
