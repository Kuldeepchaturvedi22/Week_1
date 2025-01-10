import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Array to hold the heights of 11 players
        double[] heights = new double[11];
        
        // Input object for user input
        Scanner input = new Scanner(System.in);
        
        // Variable to store the sum of all heights
        double totalHeight = 0.0;

        // Loop to take input for each player's height
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter the height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }

        // Calculate the total height
        for (double height : heights) {
            totalHeight += height;
        }

        // Calculate the mean height
        double averageHeight = totalHeight / heights.length;

        // Display the mean height
        System.out.println("The average height of the football team is: " + averageHeight);

        // Close the input scanner
        input.close();
    }
}
