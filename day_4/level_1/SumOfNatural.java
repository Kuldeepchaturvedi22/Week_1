import java.util.*;

public class SumOfNatural{

	// Created a method named sumOfNumber to calculate sum
	public int sumOfNumber(int number ){
		int sum = 0;
		// loop for calculating all the natural number sum
		for(int i=1;i<=number;i++){
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String [] args){
		
		// Used scanner class to take a input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking number of student as input from user
		System.out.println("Enter Number :");
		int number  = input.nextInt();
		
		// Making object of SumOfNatural class
		SumOfNatural son = new SumOfNatural();
		
		// Output of calculated result
		System.out.println("The sum of "+number+" natural number is "+ son.sumOfNumber(number ));
		
		// Close scanner
		input.close();
	}
}