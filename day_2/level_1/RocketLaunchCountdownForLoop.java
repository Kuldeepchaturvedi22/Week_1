import java.util.Scanner;

public class RocketLaunchCountdownForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the starting value for the countdown
        System.out.print("Enter the starting value for the countdown: ");
        int counter = scanner.nextInt();
        
        // Use a for-loop to count down from the counter to 1
        for (int i = counter; i >= 1; i--) {
            // Print the current value of the counter
            System.out.println(i);
        }
        
        // Print "Launch!" at the end of the countdown
        System.out.println("Launch!");
        
        // Close the scanner
        scanner.close();
    }
}
