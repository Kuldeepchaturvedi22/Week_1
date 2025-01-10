import java.util.Scanner;

public class LeapYear2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        
        // Check if the year is in the Gregorian calendar
        if (year < 1582) {
            System.out.println("The year must be 1582 or later.");
        } else {
            // Check if the year is a leap year using a single if statement with multiple logical conditions
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("The year " + year + " is a Leap Year.");
            } else {
                System.out.println("The year " + year + " is not a Leap Year.");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}