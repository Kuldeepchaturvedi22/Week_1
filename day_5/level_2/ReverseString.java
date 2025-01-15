import java.util.*;
public class ReverseString {
	public static void main(String [] args){
	
		// Used scanner object for taking input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking input from user
		System.out.print("Enter string :");
		String string = input.next();
		
		// Converted string to stringbuilder to use built-in method for reverse string
		StringBuilder sb = new StringBuilder(string);
		
		// Converted stringbuilder to string
		String reversed = sb.reverse().toString();
		
		// Print result
		System.out.println("The reversed string is "+reversed+" for this string "+string );
		
		// Close scanner
		input.close();
	}
}