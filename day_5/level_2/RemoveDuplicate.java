import java.util.*;
public class RemoveDuplicate {
	
	// Method for removing duplicate from string
	public static String duplicateRemoval(String string){
		
		// Created hashset for removing duplicate
		ArrayList<Character> duplicate = new ArrayList<>();
		
		// Loop thorugh string
		for(int i=0;i<string.length();i++){
		
			if(!duplicate.contains(string.charAt(i))){
				duplicate.add(string.charAt(i));
			}
			
		}
		StringBuilder sb = new StringBuilder();
		for(char value:duplicate){
			sb.append(value);
		}
		
		return sb.toString();
	}
	
	public static void main(String [] args){
	
		// Used scanner object for taking input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking input from user
		System.out.print("Enter string :");
		String string = input.next();
		String withoutDuplicate = duplicateRemoval(string);
		
		// Print result
		System.out.println("The string without duplicate is  "+withoutDuplicate+" for string "+string );
		
		// Close scanner
		input.close();
	}
}