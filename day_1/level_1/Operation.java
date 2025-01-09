// Imports the utility classes from the java.util package
import java.util.*; 

// Defines the Operation class, which will perform basic arithmetic operations on two user-entered numbers
public class Operation { 
    // Main method: the entry point of the program
    public static void main(String[] args) { 
        // Creates a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in); 
        // Prompts the user to enter the first number
        System.out.println("Enter First Number :"); 
        // Reads the user input for the first number
        double number1 = sc.nextDouble(); 
        // Prompts the user to enter the second number
        System.out.println("Enter Second Number :"); 
        // Reads the user input for the second number
        double number2 = sc.nextDouble(); 
        // Calculates the addition of the two numbers
        double addition = number1 + number2; 
        // Calculates the subtraction of the two numbers
        double subtraction = number1 - number2; 
        // Calculates the multiplication of the two numbers
        double multiplication = number1 * number2; 
        // Calculates the division of the two numbers
        double division = number1 / number2; 
        // Prints the results of the arithmetic operations to the console
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division); 
    }
}
