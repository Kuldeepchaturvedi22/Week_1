import java.util.*;
class CountVowelsAndConsonants {

	public static void main(String [] args){
		
		// Created scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// prompt for taking input from user
		System.out.print("Enter a string :");
		String string = input.next();
		
		int vowels = 0, consonants = 0;
		string.toLowerCase();
		
		// Loop through string for checking vowel and consonants
		for(int i = 0;i < string.length();i++){
		
			if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u'){
				vowels++;
			}
			else{
				consonants++;
			}
		}
		
		// Print result
		System.out.println("There is "+vowels+" vowels and "+consonants+" consonants in this string "+string);
		
		// Close scanner
		input.close();
	}
	
}