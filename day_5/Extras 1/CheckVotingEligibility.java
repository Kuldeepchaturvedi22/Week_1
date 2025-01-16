import java.util.*;
class CheckVotingEligibility {

    // Method to generate random 2-digit ages for a given number of students
    public static int[] generateAges(int numberOfStudents) {
        Random random = new Random();
        int[] ages = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = random.nextInt(90) + 10; // Generates random ages from 10 to 99
        }
        return ages;
    }

    // Method to check voting eligibility and return a 2D String array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "Cannot Vote";
            } else if (age >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] array) {
        System.out.printf("%-10s%-15s%n", "Age", "Eligibility");
        System.out.println("------------------------");
        for (String[] row : array) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        // Define the number of students
        int numberOfStudents = 10;

        // Generate ages for students
        int[] ages = generateAges(numberOfStudents);

        // Check voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Display the results in a tabular format
        displayTable(eligibility);
    }
}
