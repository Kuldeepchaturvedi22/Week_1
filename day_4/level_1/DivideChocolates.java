import java.util.*;

public class DivideChocolates{

	// Created a method named findChocolates to get divided chocolates and remaining chocolates
	public static void findChocolates(int number1,int number2){
		// Finding divided chocolates and remaining chocolates
		int remainingChocolate = number1%number2;
		int dividedChocolate = number1/number2;
		
		// Output of calculated result
		System.out.println("The divided chocolates is "+dividedChocolate+" chocolates per students and The remaining chocolates is "+remainingChocolate);
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking chocolates number as input from user
		System.out.println("Enter Number of Chocolates :");
		int numberOfChocolates  = input.nextInt();
		
		// Prompt for taking children number as input from user
		System.out.println("Enter Number of Students :");
		int numberOfChildren = input.nextInt();
		
		// Calling a method
		findChocolates(numberOfChocolates,numberOfChildren);
		
		// Close scanner
		input.close();
		
	}
}