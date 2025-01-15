import java.util.*;
public class PalindromeString {
	
	// Method for checking if the string is palindrome or not
	public static boolean check (String string){
	
		// Loop thorugh string
		for(int i=0;i<string.length();i++){
		
			if(string.charAt(i)!=string.charAt(string.length()-i-1)){
				return false;
			}
			
		}
		return true;
	}
	
	public static void main(String [] args){
	
		// Used scanner object for taking input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt for taking input from user
		System.out.print("Enter string :");
		String string = input.next();
		
		// Print result
		System.out.println("Is string "+string+" is palindrome string ?x "+check(string) );
		
		// Close scanner
		input.close();
	}
}