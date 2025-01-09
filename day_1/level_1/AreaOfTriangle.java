// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the AreaOfTriangle class, which will calculate and display the area of a triangle in both square centimeters and square inches
public class AreaOfTriangle { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Creates a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); 
        // Prompts the user to enter the base of the triangle
        System.out.println("Enter Base of Triangle :"); 
        // Reads the user input for the base of the triangle
        double base = sc.nextDouble(); 
        // Prompts the user to enter the height of the triangle
        System.out.println("Enter Height of Triangle :"); 
        // Reads the user input for the height of the triangle
        double height = sc.nextDouble(); 
        // Calculates the area of the triangle in square centimeters
        double areaOfTriangleCM = 0.5 * base * height; 
        // Conversion factor from centimeters to inches
        double cmToInch = 0.393701; 
        // Converts the base from centimeters to inches
        double baseI = base * cmToInch; 
        // Converts the height from centimeters to inches
        double heightI = height * cmToInch; 
        // Calculates the area of the triangle in square inches
        double areaOfTriangleI = 0.5 * baseI * heightI; 
        // Prints the area of the triangle in square centimeters and square inches to the console
        System.out.println("Area of a Triangle in Square Centimeters is " + areaOfTriangleCM + " and in Square Inches is " + areaOfTriangleI); 
    }
}
