import java.util.*;
public class LongestWord {
	
	// Method for finding longest word in sentence
	public static String longest(String string){
	
		// Created array to store string
		String [] stringArray = string.split(" ");
		
		int count = 0,tempCount = 0,index = 0;
		
		// Loop thorugh 'stringArray' array of string
		
		for(int i=0;i<stringArray.length;i++){
			for(int j=0;j<stringArray[i].length();j++){
				tempCount++;
			}
			if(count <= tempCount){
			
				count = tempCount;
				index = i;
				tempCount = 0;
				
			}
			else{
				tempCount = 0;
			}
			
		}
		
		return stringArray[index];
	}
	
	public static void main(String [] args){
	
		// Used scanner object for taking input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking input from user
		System.out.print("Enter string :");
		String string = input.nextLine();
		
		String word = longest(string);
		
		// Print result
		System.out.println("The longest string is  "+word+" for string "+string );
		
		// Close scanner
		input.close();
	}
}