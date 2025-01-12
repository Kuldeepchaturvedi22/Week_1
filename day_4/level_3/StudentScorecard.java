import java.util.*;
public class StudentScorecard {

    public static void main(String[] args) {
	
		// Created scanner method for taking input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        int[][] scores = generateRandomScores(numStudents);
        double[][] results = calculateResults(scores);

        displayScorecard(scores, results);
		
		// Close scanner
		input.close();
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 50 + random.nextInt(51); // Physics score between 50 and 100
            scores[i][1] = 50 + random.nextInt(51); // Chemistry score between 50 and 100
            scores[i][2] = 50 + random.nextInt(51); // Maths score between 50 and 100
        }

        return scores;
    }

    // Method to calculate the total, average, and percentages for each student
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3]; // Total, Average, Percentage

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display the scorecard of all students
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Scorecard:");
        System.out.println("Student    Physics    Chemistry    Maths    Total    Average    Percentage");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10s %-10d %-12d %-10d %-8d %-10.2f %-10.2f%n",
                              "Student " + (i + 1), scores[i][0], scores[i][1], scores[i][2],
                              (int) results[i][0], results[i][1], results[i][2]);
        }
    }
}
