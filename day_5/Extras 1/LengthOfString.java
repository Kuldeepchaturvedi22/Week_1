import java.util.*;
public class LengthOfString {

	// Method for getting string length without length() method
	public static int lengthOfTheString (String string){
	
		int count = 0;
		try{
			for(int i=0;i>=0;i++){
				if(string.charAt(i)>=0){
					count++;
				}
			}
		}catch(Exception e){
			return count;
		}
		return count;
	}
	public static void main(String [] args){
		
		// Used scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking input from user
		System.out.print("Enter string : ");
		String string = input.next();
		
		// Calling method to get string length
		int count = lengthOfTheString(string);
		
		// Print result
		System.out.println("The length of string is "+count);
		
		// Close scanner
		input.close();
	}
}