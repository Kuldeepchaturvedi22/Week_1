import java.util.*;
public class CompareTwoStrings {
	
	// Method for compare two strings
	public boolean compareString(String firstString,String secondString){
		
		// Check if length of both string is same
		if(firstString.length()!= secondString.length()){
			return false;
		}
		// Compairing two strings
		for(int i = 0;i < firstString.length();i++){
			if(firstString.charAt(i) != secondString.charAt(i)){
				return false;
			}
		}
		return true;
	}

	public static void main(String[]args){
	
		// Created scanner object for takin input from user
		Scanner input = new Scanner(System.in);
		
		// Taking input from user
		System.out.println("Enter first String :");
		String firstString = input.next();
		
		System.out.println("Enter second String :");
		String secondString = input.next();
		
		// Creating object of CompareTwoStrings
		CompareTwoStrings cts = new CompareTwoStrings();
		
		// Calling method by class object
		boolean check = cts.compareString(firstString,secondString);
		
		// Print the result
		System.out.println(check);
		
		// Close scanner
		input.close();
	}
}