import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        // Random object to generate guesses
        Random random = new Random();
        
        // The range of the numbers to guess
        int lowerBound = 1;
        int upperBound = 100;

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        
        boolean correctGuess = false;
        int guessCount = 0;

        while (!correctGuess) {
            // Generate a random guess
            int guess = generateGuess(random, lowerBound, upperBound);
            guessCount++;
            System.out.println("My guess is: " + guess);
            System.out.print("Is it 'high', 'low', or 'correct'? ");
            String feedback = scanner.next().toLowerCase();

            // Update bounds based on user feedback
            if (feedback.equals("correct")) {
                correctGuess = true;
            } else if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            } else {
                System.out.println("Please enter 'high', 'low', or 'correct'.");
            }
        }

        System.out.println("I guessed it in " + guessCount + " tries!");

        // Close the Scanner object
        scanner.close();
    }

    // Function to generate a random guess within the given bounds
    public static int generateGuess(Random random, int lowerBound, int upperBound) {
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }
}