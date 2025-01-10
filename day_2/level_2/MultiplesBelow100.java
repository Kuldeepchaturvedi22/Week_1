import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the input value for the variable named number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Print the multiples of the number below 100
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            // Check if i perfectly divides the number
            if (i % number == 0) {
                // Print the multiple
                System.out.println(i);
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
