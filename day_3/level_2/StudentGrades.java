import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        // Create an input object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create arrays to store marks, percentages, and grades of the students
        int[][] marks = new int[numberOfStudents][3];
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];

        // Take input for marks of students in physics, chemistry, and maths
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                marks[i][j] = input.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid input. Please enter positive values.");
                    j--; // Decrement index to ask for input again
                }
            }
        }

        // Calculate percentage and grade of the students based on the percentage
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totalMarks / 3.0;

            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Display marks, percentages, and grades of each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Marks for student " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.println("Percentage: " + percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println();
        }

        // Close the input
        input.close();
    }
}
