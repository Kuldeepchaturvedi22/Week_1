import java.util.Scanner;

public class FriendsInfo {
	
	// Created a method for finding youngest friend
	public static int findTheYoungest(int [] ages){
		// Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
		return youngestIndex;
	}
	// Created a method for finding tallest friend
	public static int findTheTallest(double [] heights){
        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
		return tallestIndex;
	}
	
    public static void main(String[] args) {
        // Names of the friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        
        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Create an input object to take user input
        Scanner input = new Scanner(System.in);

        // Take user input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + friends[i] + ": ");
            ages[i] = input.nextInt();
            System.out.print("Enter the height of " + friends[i] + " (in cm): ");
            heights[i] = input.nextDouble();
        }


        // Display the youngest and tallest friends
        System.out.println("The youngest friend is: " + friends[findTheYoungest(ages)] + " with age " + ages[findTheYoungest(ages)]);
        System.out.println("The tallest friend is: " + friends[findTheTallest(heights)] + " with height " + heights[findTheTallest(heights)] + " cm");

        // Close the input
        input.close();
    }
}
