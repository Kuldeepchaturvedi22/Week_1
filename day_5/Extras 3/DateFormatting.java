import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateFormatting {
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

        scanner.close();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate1 = inputDate.format(formatter1);

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate2 = inputDate.format(formatter2);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String formattedDate3 = inputDate.format(formatter3);

        System.out.println("Entered date in dd/MM/yyyy format: " + formattedDate1);
        System.out.println("Entered date in yyyy-MM-dd format: " + formattedDate2);
        System.out.println("Entered date in EEE, MMM dd, yyyy format: " + formattedDate3);
    }
}