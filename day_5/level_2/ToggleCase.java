import java.util.*;
public class ToggleCase {
	
	// Method for toggle lowercase
	public static String toggleToLowerCase (String string){
		
		return string.toLowerCase();
	}
	
	// Method for toggle uppercase
	public static String toggleToUpperCase (String string){
		return string.toUpperCase();
	}
	
	public static void main(String [] args){
	
		// Used scanner object for taking input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking input from user
		System.out.print("Enter string :");
		String string = input.next();
		
		// For lowercase
		String lowertoggle = toggleToLowerCase(string);
		// For uppercase
		String uppertoggle = toggleToUpperCase(string);
		
		// Print result
		System.out.println("The toggled string in lowercase is  "+lowertoggle+" and for uppercase is "+uppertoggle );
		
		// Close scanner
		input.close();
	}
}