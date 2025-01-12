import java.util.*;

public class MaximumHandshake{

	// Created a method named calculateMaximumHandshake to calculate maximum handshake
	public double calculateMaximumHandshake(int student){
		// Calculate maximum handshake
		double handshake = (student*(student-1))/2;
		return handshake;
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking number of student as input from user
		System.out.println("Enter Number of Student :");
		int student = input.nextInt();
		
		// Making object of MaximumHandshake class
		MaximumHandshake mh = new MaximumHandshake();
		
		// Output of calculated result
		System.out.println("The maximum handshake is "+ (int) mh.calculateMaximumHandshake(student) +" for " +student+" Students ");
		
		// Close scanner
		input.close();
	}
}