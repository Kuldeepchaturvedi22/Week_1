import java.util.*;
public class LeapYear {

	public static void checkLeepYear(int year){
        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year " + year + " is a Leap Year.");
        } else {
            System.out.println("The year " + year + " is not a Leap Year.");
        }
	}
	
    public static void main(String[] args) {
	
		// Used scanner class to take input from user
		Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a year
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();
       
        // Calling the method
		checkLeepYear(year);
		
        // Close the scanner
        input.close();
    }
}