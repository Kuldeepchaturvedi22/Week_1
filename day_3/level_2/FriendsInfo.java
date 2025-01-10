import java.util.Scanner;

public class FriendsInfo {
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

        // Find the youngest friend
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

        // Find the tallest friend
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friends
        System.out.println("The youngest friend is: " + friends[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is: " + friends[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        // Close the input
        input.close();
    }
}
