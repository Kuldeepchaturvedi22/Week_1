import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Read the number of terms from the user
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int numberOfTerms = scanner.nextInt();
        
        // Close the Scanner object
        scanner.close();

        // Generate and print the Fibonacci sequence
        printFibonacciSequence(numberOfTerms);
    }

    // Function to generate and print the Fibonacci sequence
    public static void printFibonacciSequence(int terms) {
        int first = 0, second = 1;
        
        System.out.print("Fibonacci Sequence: ");
        
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");
            
            // Calculate the next term
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // Move to the next line after printing the sequence
    }
}