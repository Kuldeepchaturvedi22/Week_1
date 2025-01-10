import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the month, day, and year
        System.out.print("Enter the month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int d = scanner.nextInt();
        System.out.print("Enter the year: ");
        int y = scanner.nextInt();
        
        // Calculate the values using the given formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        
        // Print the day of the week (0 for Sunday, 1 for Monday, etc.)
        System.out.println("The day of the week is: " + d0);
        
        // Close the scanner
        scanner.close();
    }
}
