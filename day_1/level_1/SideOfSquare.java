// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the SideOfSquare class, which will calculate and display the length of the side of a square given its perimeter
public class SideOfSquare { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Creates a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); 
        // Prompts the user to enter the perimeter of the square
        System.out.println("Enter Perimeter of Square :"); 
        // Reads the user input for the perimeter of the square
        double perimeter = sc.nextDouble(); 
        // Calculates the length of one side of the square
        double side = perimeter / 4; 
        // Prints the length of the side and the perimeter to the console
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter); 
    }
}
