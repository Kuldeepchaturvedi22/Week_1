import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the salary
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        
        // Prompt the user to enter the years of service
        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = scanner.nextInt();
        
        // Initialize the bonus to 0
        double bonus = 0.0;
        
        // Check if the years of service is more than 5
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            bonus = salary * 0.05;
        }
        
        // Print the bonus amount
        System.out.println("The bonus amount is " + bonus);
        
        // Close the scanner
        scanner.close();
    }
}
