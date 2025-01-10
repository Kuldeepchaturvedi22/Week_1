import java.util.Scanner;

public class RocketLaunchCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the starting value for the countdown
        System.out.print("Enter the starting value for the countdown: ");
        int counter = scanner.nextInt();
        
        // Use a while loop to count down from the counter to 1
        while (counter >= 1) {
            // Print the current value of the counter
            System.out.println(counter);
            
            // Decrement the counter
            counter--;
        }
        
        // Print "Launch!" at the end of the countdown
        System.out.println("Launch!");
        
        // Close the scanner
        scanner.close();
    }
}
