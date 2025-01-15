import java.util.*;
class CountVowelsAndConsonants {

	// Method to convert each character to lowercase using charAt()
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
	
	 public static int[] vowelsAndConsonents(String text) {
		int vowels = 0, consonants = 0;
		
		// Loop through string for checking vowel and consonants
		for(int i = 0;i < string.length();i++){
		
			if(string.charAt(i)=='a' || string.charAt(i)=='e' || string.charAt(i)=='i' || string.charAt(i)=='o' || string.charAt(i)=='u'){
				vowels++;
			}
			else{
				consonants++;
			}
		}
		int [] array = {vowels,consonants};
		return array;
	 }


	public static void main(String [] args){
		
		// Created scanner object to take input from user
		Scanner input = new Scanner(System.in);
		
		// prompt for taking input from user
		System.out.print("Enter a string :");
		String string = input.next();
		
		String text = toLowerCaseCustom(string);
		int [] array = vowelsAndConsonents(text);
		
		// Print result
		System.out.println("There is "+array[0]+" vowels and "+array[1]+" consonants in this string "+string);
		
		// Close scanner
		input.close();
	}
	
}