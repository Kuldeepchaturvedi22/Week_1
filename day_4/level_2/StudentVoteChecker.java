import java.util.*;
public class StudentVoteChecker {

	public boolean canStudentVote(int age){
		if (age >= 18) {
            return true;
        }
		return false;
	}
	
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
		
		// Creating StudentVoteChecker class object for method calling
		StudentVoteChecker svc = new StudentVoteChecker();

        // Loop to check voting eligibility
        for (int i = 0; i < ages.length; i++) {
		
			// Output each and every student voting status
            System.out.println("Student "+(i+1)+" can vote : "+svc.canStudentVote(ages[i]));
			
        }

        // Closing the scanner
        input.close();
    }
}
