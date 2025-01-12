import java.util.*;

public class SmallestAndLargest{

	// Created a method named smallestAndLargest to check smallest and largest number
	public static void smallestAndLargest(int number1,int number2,int number3){
		// Finding smallest and largest
		int smallest = Math.min(Math.min(number1,number2),number3);
		int largest = Math.max(Math.max(number1,number2),number3);
		// Output of calculated result
		System.out.println("The Smallest Number is "+smallest+" and The Largest Number is "+largest);
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
		
		// Prompt for taking third number as input from user
		System.out.println("Enter Number 3 :");
		int number3 = input.nextInt();
		
		// Calling a method
		smallestAndLargest(number1,number2,number3);
		
		// Close scanner
		input.close();
		
	}
}