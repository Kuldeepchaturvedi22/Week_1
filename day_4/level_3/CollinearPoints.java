import java.util.*;
public class CollinearPoints {

    // Method to find if three points are collinear using the slope formula
    public static boolean arePointsCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to find if three points are collinear using the area of the triangle formula
    public static boolean arePointsCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
	
		// Created scanner object for taking input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        System.out.print("Enter x3: ");
        double x3 = input.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = input.nextDouble();

        // Check if points are collinear using slope formula
        boolean collinearSlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear using slope formula: " + collinearSlope);

        // Check if points are collinear using area of triangle formula
        boolean collinearArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear using area of triangle formula: " + collinearArea);

        // Example with points A(2, 4), B(4, 6), and C(6, 8)
        double x1Example = 2, y1Example = 4, x2Example = 4, y2Example = 6, x3Example = 6, y3Example = 8;
        boolean exampleCollinearSlope = arePointsCollinearUsingSlope(x1Example, y1Example, x2Example, y2Example, x3Example, y3Example);
        boolean exampleCollinearArea = arePointsCollinearUsingArea(x1Example, y1Example, x2Example, y2Example, x3Example, y3Example);

        System.out.println("Example points A(2, 4), B(4, 6), C(6, 8):");
        System.out.println("Are example points collinear using slope formula: " + exampleCollinearSlope);
        System.out.println("Are example points collinear using area of triangle formula: " + exampleCollinearArea);
		
		// Close scanner
		input.close();
    }
}
