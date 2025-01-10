import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the month
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        
        // Prompt the user to enter the day
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();
        
        // Check if the date falls within the Spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month == 4) || (month == 5)) {
            System.out.println("It's a Spring Season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
