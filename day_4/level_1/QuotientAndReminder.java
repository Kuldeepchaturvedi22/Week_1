import java.util.*;

public class QuotientAndReminder{

	// Created a method named findRemainderAndQuotient to get remainder and quotient
	public static void findRemainderAndQuotient(int number1,int number2){
		// Finding remainder and quotient
		int remainder = number1%number2;
		int quotient = number1/number2;
		
		// Output of calculated result
		System.out.println("The remainder is "+remainder+" and The quotient is "+quotient);
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking first number as input from user
		System.out.println("Enter Number 1 :");
		int number1 = input.nextInt();
		
		// Prompt for taking second number as input from user
		System.out.println("Enter Number 2 :");
		int number2 = input.nextInt();
		
		// Calling a method
		findRemainderAndQuotient(number1,number2);
		
		// Close scanner
		input.close();
		
	}
}