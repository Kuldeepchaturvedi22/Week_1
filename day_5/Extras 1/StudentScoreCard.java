import java.util.*;
public class StudentScoreCard {

    // Method to generate random 2-digit scores for PCM subjects for n students
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Physics scores (60-100)
            scores[i][1] = random.nextInt(41) + 60; // Chemistry scores (60-100)
            scores[i][2] = random.nextInt(41) + 60; // Maths scores (60-100)
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateStats(int[][] scores) {
        int numberOfStudents = scores.length;
        double[][] stats = new double[numberOfStudents][3]; // Total, Average, Percentage
        for (int i = 0; i < numberOfStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = percentage;
        }
        return stats;
    }

    // Method to calculate grade based on percentage
    public static String[] calculateGrades(double[][] stats) {
        int numberOfStudents = stats.length;
        String[] grades = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            double percentage = stats[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    // Method to display the scorecard in tabular format
    public static void displayScoreCard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-15s%n", "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
        System.out.println("-------------------------------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-15.2f%-10s%n", (i + 1), scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;

        // Generate random scores for PCM subjects
        int[][] scores = generateScores(numberOfStudents);

        // Calculate total, average, and percentage for each student
        double[][] stats = calculateStats(scores);

        // Calculate grades based on percentage
        String[] grades = calculateGrades(stats);

        // Display the scorecard
        displayScoreCard(scores, stats, grades);
    }
}
