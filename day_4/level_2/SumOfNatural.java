import java.util.*;

public class SumOfNatural{

	// Created a method named sumOfNumber to calculate sum
	public static int sumOfNumber(int number ){
	
		// calculate sum of all natural number using formula
		int sum = number*(number+1)/2;
		return sum;
	}
	
	// Created another method for recursion
	public static int recursiveCheck(int number){
		if(number ==0){
			return 0;
		}
		int sum = number;
		sum += recursiveCheck(number -1);
		return sum;
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking number as input from user
		System.out.println("Enter Number :");
		int number  = input.nextInt();
		
		//Checking if the number is natural or not
		if(number<0){
			System.out.println("This is not a natural number");
		}
		
		// Making object of SumOfNatural class
		//SumOfNatural son = new SumOfNatural();
		
		// Output of calculated result
		System.out.println("The sum of "+number+" natural number using formula is "+ sumOfNumber(number ) + " and using recursion is " +recursiveCheck(number));
		
		// Close scanner
		input.close();
	}
}