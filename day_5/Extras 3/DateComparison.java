import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateStr = scanner.next();

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateStr = scanner.next();

        LocalDate firstDate = null;
        LocalDate secondDate = null;

        try {
            firstDate = LocalDate.parse(firstDateStr);
            secondDate = LocalDate.parse(secondDateStr);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            scanner.close();
            return;
        }

        scanner.close();

        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date (" + firstDate + ") is before the second date (" + secondDate + ").");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date (" + firstDate + ") is after the second date (" + secondDate + ").");
        } else {
            System.out.println("The first date (" + firstDate + ") is the same as the second date (" + secondDate + ").");
        }
    }
}