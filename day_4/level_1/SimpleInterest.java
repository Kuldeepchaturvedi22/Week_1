import java.util.*;

public class SimpleInterest{

	// Created a method named calculateSimpleInterest to calculate simple interest
	public double calculateSimpleInterest(int principal,int rate,int time){
		// Calculate simple interest
		double simpleInterest = (principal*rate*time)/100;
		return simpleInterest;
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking pincipal as input from user
		System.out.println("Enter Principal :");
		int principal = input.nextInt();
		
		// Prompt for taking rate as input from user
		System.out.println("Enter Rate :");
		int rate = input.nextInt();
		
		// Prompt for taking time as input from user
		System.out.println("Enter Time :");
		int time = input.nextInt();
		
		// Making object of SimpleInterest class
		SimpleInterest si = new SimpleInterest();
		
		// Output of calculated result
		System.out.println("The Simple Interest is "+ si.calculateSimpleInterest(principal,rate,time) +" for Principal " +principal+" Rate of Interest "+rate+" and Time "+time);
		
		// Close scanner
		input.close();
		
	}
}