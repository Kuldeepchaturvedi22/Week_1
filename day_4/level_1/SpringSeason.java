import java.util.*;

public class SpringSeason{

	// Created a method named checkSeason to check season
	public boolean checkSeason (int month,int day){
		// Check if the date falls within the Spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month == 4) || (month == 5)) {
            return true;
        }
		return false;
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter the month
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        
        // Prompt the user to enter the day
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();

		// Making object of SpringSeason class
		SpringSeason ss = new SpringSeason();
		
		// Output result
		if(ss.checkSeason(month,day)){
			System.out.println("This is the SpringSeason");
		}
		else{
			System.out.println("This is not the SpringSeason");
		}
		
		// Close scanner
		input.close();
		
	}
}