import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = scanner.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();
        
        // Calculate the total and percentage
        int total = physics + chemistry + maths;
        double percentage = (total / 3.0);
        
        // Determine the grade and remarks based on the percentage
        String grade;
        String remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }
        
        // Print the percentage, grade, and remarks
        System.out.println("The average mark is " + percentage + "%.");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        
        // Close the scanner
        scanner.close();
    }
}
