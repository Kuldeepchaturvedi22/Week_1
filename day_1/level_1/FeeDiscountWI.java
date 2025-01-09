// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the FeeDiscountWI class, which will calculate and display the discount amount and final discounted fee for a student
public class FeeDiscountWI { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Creates a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); 
        // Prompts the user to enter the student fee
        System.out.println("Enter Student Fee :"); 
        // Reads the user input for student fee
        int studentFee = sc.nextInt(); 
        // Prompts the user to enter the university discount percentage
        System.out.println("Enter University Discount :"); 
        // Reads the user input for discount percentage
        int discountPercent = sc.nextInt(); 
        // Calculates the discount amount
        int discount = studentFee * discountPercent / 100; 
        // Prints the discount amount and the final discounted fee to the console
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + (studentFee - discount)); 
    }
}
