import java.util.*;
public class Quadratic {

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        // Calculate delta
        double delta = Math.pow(b, 2) + 4 * a * c;

        // If delta is positive, find two roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        // If delta is zero, find one root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        // If delta is negative, return an empty array
        else {
            return new double[]{};
        }
    }

    public static void main(String[] args) {
	
		// Used scanner for taking input from user
        Scanner input = new Scanner(System.in);

        // Take input for a, b, and c
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        // Find the roots of the quadratic equation
        double[] roots = findRoots(a, b, c);

        // Display the roots
        if (roots.length == 0) {
            System.out.println("The equation has no real roots.");
        } else {
            System.out.println("The roots of the equation are:");
            for (double root : roots) {
                System.out.println(root);
            }
        }
		
		// Close scanner
        input.close();
    }
}