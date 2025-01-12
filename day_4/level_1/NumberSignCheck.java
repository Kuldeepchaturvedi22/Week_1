import java.util.*;

public class NumberSignCheck{

	// Created a method named sighCheck to calculate maximum handshake
	public int sighCheck(int number ){
		// Checking sign of number
		if(number>0){
			return 1;
		}
		else if(number<0){
			return -1;
		}
		return 0;
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking number of student as input from user
		System.out.println("Enter Number :");
		int number  = input.nextInt();
		
		// Making object of NumberSignCheck class
		NumberSignCheck nsc = new NumberSignCheck();
		
		// Output of calculated result
		System.out.println("The sign is "+ nsc.sighCheck(number ) +" for number " +number);
		
		// Close scanner
		input.close();
	}
}