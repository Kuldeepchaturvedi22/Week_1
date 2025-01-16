import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDateStr = scanner.next();
        
        LocalDate inputDate = null;
        try {
            inputDate = LocalDate.parse(inputDateStr);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            scanner.close();
            return;
        }
        
        System.out.print("Enter number of days to add: ");
        int daysToAdd = scanner.nextInt();
        
        System.out.print("Enter number of months to add: ");
        int monthsToAdd = scanner.nextInt();
        
        System.out.print("Enter number of years to add: ");
        int yearsToAdd = scanner.nextInt();
        
        System.out.print("Enter number of weeks to subtract: ");
        int weeksToSubtract = scanner.nextInt();
        
        scanner.close();
        
        LocalDate modifiedDate = inputDate.plusDays(daysToAdd).plusMonths(monthsToAdd).plusYears(yearsToAdd);
        LocalDate finalDate = modifiedDate.minusWeeks(weeksToSubtract);
        
        String formattedFinalDate = finalDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        System.out.println("Final date after performing the arithmetic operations: " + formattedFinalDate);
    }
}