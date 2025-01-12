import java.util.*;

public class HowManyRound{

	// Created a method named calculateHowManyRound to calculate rounds
	public double calculateHowManyRound(int side1,int side2,int side3){
		// Calculate rounds
		int perimeter = side1+side2+side3;
		double round = (double)5/(double)perimeter;
		return round;
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking first side as input from user
		System.out.println("Enter Side 1 :");
		int side1 = input.nextInt();
		
		// Prompt for taking second side as input from user
		System.out.println("Enter Side 2 :");
		int side2 = input.nextInt();
		
		// Prompt for taking third side as input from user
		System.out.println("Enter Side 3 :");
		int side3 = input.nextInt();
		
		// Making object of HowManyRound class
		HowManyRound hmr = new HowManyRound();
		
		// Output of calculated result
		System.out.println("The maximum round to complete 5km is "+ hmr.calculateHowManyRound(side1,side2,side3));
		
		// Close scanner
		input.close();
		
	}
}