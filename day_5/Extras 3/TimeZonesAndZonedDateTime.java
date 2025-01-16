import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.zone.ZoneRulesException;
import java.util.Scanner;

public class TimeZonesAndZonedDateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a time zone (e.g., GMT, Asia/Kolkata, America/Los_Angeles): ");
        String timeZone = scanner.next();

        ZonedDateTime zonedDateTime = null;
        try {
            zonedDateTime = ZonedDateTime.now(ZoneId.of(timeZone));
        } catch (ZoneRulesException e) {
            System.out.println("Invalid time zone. Please enter a valid time zone.");
            scanner.close();
            return;
        }

        scanner.close();

        String formattedTime = zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z"));

        System.out.println("Current time in " + timeZone + ": " + formattedTime);
    }
}