import java.util.*;

public class MaximumHandshake2{

	// Created a method named calculateMaximumHandshake to calculate maximum handshake
	public double calculateMaximumHandshake(int numberOfStudents ){
		// Calculate maximum handshake
		double handshake = (numberOfStudents *(numberOfStudents -1))/2;
		return handshake;
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking number of student as input from user
		System.out.println("Enter Number of Student :");
		int numberOfStudents  = input.nextInt();
		
		// Making object of MaximumHandshake class
		MaximumHandshake mh = new MaximumHandshake();
		
		// Output of calculated result
		System.out.println("The maximum handshake is "+ (int) mh.calculateMaximumHandshake(numberOfStudents ) +" for " +numberOfStudents+" Students ");
		
		// Close scanner
		input.close();
	}
}