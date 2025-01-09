import java.util.Scanner;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary
        System.out.print("Enter the salary: INR ");
        double salary = sc.nextDouble();

        // Input bonus
        System.out.print("Enter the bonus: INR ");
        double bonus = sc.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);

    }
}
