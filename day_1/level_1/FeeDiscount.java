// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the FeeDiscount class, which will calculate and display the discount amount and final discounted fee for a student
public class FeeDiscount { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Defines the total fee for the student
        int studentFee = 125000; 
        // Defines the discount percentage
        int discountPercent = 10; 
        // Calculates the discount amount
        int discount = studentFee * discountPercent / 100; 
        // Prints the discount amount and the final discounted fee to the console
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (125000 - discount)); 
    }
}
