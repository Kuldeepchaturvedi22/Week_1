import java.util.*;
public class EmployeeBonusCalculator {

    // Method to determine the salary and years of service and return a 2D array
    public static int[][] generateSalariesAndYearsOfService(int numEmployees) {
        Random random = new Random();
        int[][] salaryAndYears = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            salaryAndYears[i][0] = random.nextInt(90000) + 10000; // 5-digit salary
            salaryAndYears[i][1] = random.nextInt(11); // Years of service (0 to 10)
        }
        return salaryAndYears;
    }

    // Method to calculate the new salary and bonus
    public static double[][] calculateNewSalariesAndBonuses(int[][] salaryAndYears) {
        double[][] newSalaryAndBonuses = new double[salaryAndYears.length][2];
        for (int i = 0; i < salaryAndYears.length; i++) {
            int salary = salaryAndYears[i][0];
            int yearsOfService = salaryAndYears[i][1];
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            newSalaryAndBonuses[i][0] = newSalary;
            newSalaryAndBonuses[i][1] = bonus;
        }
        return newSalaryAndBonuses;
    }

    // Method to calculate the sum of old salaries, new salaries, and total bonus amount
    public static void displaySalariesAndBonuses(int[][] salaryAndYears, double[][] newSalaryAndBonuses) {
        int sumOldSalaries = 0;
        double sumNewSalaries = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-10s %-15s %-15s %-10s%n", "Employee", "Old Salary", "Years of Service", "New Salary", "Bonus");
        for (int i = 0; i < salaryAndYears.length; i++) {
            int oldSalary = salaryAndYears[i][0];
            int yearsOfService = salaryAndYears[i][1];
            double newSalary = newSalaryAndBonuses[i][0];
            double bonus = newSalaryAndBonuses[i][1];

            sumOldSalaries += oldSalary;
            sumNewSalaries += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-10d %-15d %-15.2f %-10.2f%n", i + 1, oldSalary, yearsOfService, newSalary, bonus);
        }

        System.out.println();
        System.out.println("Total Old Salary: " + sumOldSalaries);
        System.out.println("Total New Salary: " + sumNewSalaries);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        int[][] salaryAndYears = generateSalariesAndYearsOfService(numEmployees);
        double[][] newSalaryAndBonuses = calculateNewSalariesAndBonuses(salaryAndYears);
        displaySalariesAndBonuses(salaryAndYears, newSalaryAndBonuses);
    }
}
