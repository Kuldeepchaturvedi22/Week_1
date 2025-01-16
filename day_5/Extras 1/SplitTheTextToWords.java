import java.util.*;
public class SplitTheTextToWords {
  
    // Method to find the length of the String without using the built-in length() method
    public static int findLength(String string) {
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
    
    // Method to split the sentence into words using charAt() method
    public static String[] splitSentence(String sentence) {
        int length = findLength(sentence);
        int wordCount = 1; // Start with 1 to count the last word
        
        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) == ' ') {
                wordCount++;
            }
        }
        
        // Create array to store the indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (sentence.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        
        // Create array to store the words
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            int end = spaceIndexes[i];
            words[i] = sentence.substring(start, end);
            start = end + 1;
        }
        words[wordCount - 1] = sentence.substring(start, length);
        
        return words;
    }
    
    // Method to compare two string arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
        // Take user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String inputSentence = input.nextLine();
        
        // Split the text into words using custom method
        String[] customWords = splitSentence(inputSentence);
        
        // Split the text using built-in split() method
        String[] builtInWords = inputSentence.split(" ");
        
        // Compare the two string arrays
        boolean areEqual = compareStringArrays(customWords, builtInWords);
        
        // Display the result
        System.out.println("Custom split method result: " + String.join(", ", customWords));
        System.out.println("Built-in split method result: " + String.join(", ", builtInWords));
        System.out.println("Are the two methods producing the same result? " + areEqual);
        
        // Close the scanner
        input.close();
    }
}
