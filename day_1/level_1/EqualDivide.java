// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the EqualDivide class, which will calculate and display the division of pens among students
public class EqualDivide { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Defines the total number of pens available for distribution
        int pen = 14; 
        // Defines the number of students among whom the pens will be distributed
        int students = 3; 
        // Calculates the number of pens each student gets
        int penPerStudent = 14 / 3; 
        // Calculates the number of remaining pens that are not distributed
        int remainingPen = 14 % 3; 
        // Prints the number of pens per student to the console
        System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen); 
    }
}
