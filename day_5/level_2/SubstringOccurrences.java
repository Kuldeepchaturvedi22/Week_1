import java.util.*;
public class SubstringOccurrences {
	
	// Method for finding longest word in sentence
	public static int findSubstringOccurrence(String string,String substring){
	
		// Created array to store string
		String [] stringArray = string.split(" ");
		
		int count = 0,firstIndex = 0,lastIndex = substring.length()-1;
		boolean check = true;		
		// Loop thorugh string
			while(lastIndex <= string.length()){
				int index = 0;
				for(int i=firstIndex;i<=lastIndex;i++){
					if(string.charAt(i)!= substring.charAt(index)){
						check = false;
						break;
					}
					else{
						check = true;
						index++;
					}
				}
				if(check){
					count++;
				}
				firstIndex++;
				lastIndex++;
			}
		
		return count;
	}
	
	public static void main(String [] args){
	
		// Used scanner object for taking input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking input from user
		System.out.print("Enter string :");
		String string = input.nextLine();
		
		System.out.print("Enter substring :");
		String substring = input.nextLine();
		
		int count = findSubstringOccurrence(string,substring);
		
		// Print result
		System.out.println("The substring occurrence is  "+count);
		
		// Close scanner
		input.close();
	}
}