import java.util.*;
public class FootballTeamHeights {

    //Method to generate random heights for the players
    public static int [] generateRandomHeights(int size, int min, int max) {
        int[] heights = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            heights [i] = random.nextInt(max - min + 1) + min;
        }
        return heights;
    }

    // Method to find the sum of all heights in the array
    public static int findSumOfHeights(int [] heights) {
        int sum = 0;
        for (int height: heights) {
            sum += height;
        }
        return sum ;
    }

    // Method to calculate the mean height
    public static double findMeanHeight(int[] heights){
        int sum = findSumOfHeights(heights);
        return (double)sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortestHeight( int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    // Method to find the tallest height
    public static int findTallestHeight(int [] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        // Create an array to store heights of 11 players
        int[] heights = generateRandomHeights(11, 150, 250);

        // Display the generated heights
        System.out.println("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Find and display the sum of heights
        int sumOfHeights = findSumOfHeights(heights);
        System.out.println("Sum of heights: " + sumOfHeights );

        // Find and display the mean height
        double meanHeight = findMeanHeight(heights);
        System.out.println("Mean height: " + meanHeight);

        // Find and display the shortest height
        int shortestHeight = findShortestHeight(heights);
        System.out.println("Shortest height: " + shortestHeight );

        // Find and display the tallest height
        int tallestHeight = findTallestHeight(heights);
        System.out.println("Tallest height: " + tallestHeight);
    }
}
