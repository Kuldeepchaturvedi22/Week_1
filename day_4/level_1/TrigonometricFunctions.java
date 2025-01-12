import java.util.*;
public class TrigonometricFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Converted angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculated sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Return results in an array
        double[] results = {sine, cosine, tangent};
        return results;
    }

    public static void main(String[] args) {
		
		// Used scanner class to take input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking angle as input from user
		System.out.println("Enter Angle in Degrees");
        double angle = input.nextDouble();
		
        // Used array to store result by calling method and giving angle as input
        double[] results = calculateTrigonometricFunctions(angle);
        
		// Output result
        System.out.println("Sine: " + results[0] +" Cosine: " + results[1] +" Tangent: " + results[2]);
        
		// Close scanner
		input.close();
    }
}
