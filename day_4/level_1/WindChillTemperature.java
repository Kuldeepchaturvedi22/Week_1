import java.util.*;

public class WindChillTemperature{

	// Created a method named calculateWindChill to get divided chocolates and remaining chocolates
	public static void calculateWindChill(double temperature,double windSpeed){
		// Finding divided chocolates and remaining chocolates
		double windchill =  35.74 + 0.6215 * temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16);
		
		// Output of calculated result
		System.out.println("The windchill temperature is "+windchill);
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking temperature as input from user
		System.out.println("Enter Temperature :");
		double temperature  = input.nextDouble();
		
		// Prompt for taking windSpeed as input from user
		System.out.println("Enter Windspeed :");
		double windSpeed = input.nextDouble();
		
		// Calling a method
		calculateWindChill(temperature,windSpeed);
		
		// Close scanner
		input.close();
		
	}
}