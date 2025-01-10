import java.util.Scanner;

public class StudentVotingEligibility {
    public static void main(String[] args) {
        // Array to store the ages of 10 students
        int[] ages = new int[10];

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input loop for each student's age
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Loop to check voting eligibility
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Error: Invalid age " + age);
            } else if (age >= 18) {
                System.out.println("Student aged " + age + " is eligible to vote.");
            } else {
                System.out.println("Student aged " + age + " is not eligible to vote.");
            }
        }

        // Closing the scanner
        input.close();
    }
}
