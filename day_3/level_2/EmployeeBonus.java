import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        // Arrays to store salaries and years of service
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalaries = new double[10];
        double[] bonuses = new double[10];

        // Variables to store total bonus, old salary, and new salary
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input object for user input
        Scanner input = new Scanner(System.in);

        // Loop to take input from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the salary of employee " + (i + 1) + ": ");
            salaries[i] = input.nextDouble();
            System.out.print("Enter the years of service of employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();

            // Validate input
            if (salaries[i] < 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Please enter valid values.");
                i--; // Decrement index to re-ask for input
            }
        }

        // Loop to calculate the bonus and new salary
        for (int i = 0; i < 10; i++) {
            bonuses[i] = (yearsOfService[i] > 5) ? (salaries[i] * 0.05) : (salaries[i] * 0.02);
            newSalaries[i] = salaries[i] + bonuses[i];
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Print the total bonus payout, total old salary, and total new salary
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);

        // Close the input scanner
        input.close();
    }
}
