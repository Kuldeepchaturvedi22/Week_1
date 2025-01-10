import java.util.Scanner;

public class FriendComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for Amar
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = scanner.nextInt();
        
        // Input for Akbar
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = scanner.nextInt();
        
        // Input for Anthony
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = scanner.nextInt();
        
        // Determine the youngest friend
        int minAge = ageAmar;
        String youngest = "Amar";
        if (ageAkbar < minAge) {
            minAge = ageAkbar;
            youngest = "Akbar";
        }
        if (ageAnthony < minAge) {
            minAge = ageAnthony;
            youngest = "Anthony";
        }
        
        // Determine the tallest friend
        int maxHeight = heightAmar;
        String tallest = "Amar";
        if (heightAkbar > maxHeight) {
            maxHeight = heightAkbar;
            tallest = "Akbar";
        }
        if (heightAnthony > maxHeight) {
            maxHeight = heightAnthony;
            tallest = "Anthony";
        }
        
        // Print the results
        System.out.println("The youngest friend is " + youngest + " with age " + minAge + " years.");
        System.out.println("The tallest friend is " + tallest + " with height " + maxHeight + " cm.");
        
        // Close the scanner
        scanner.close();
    }
}
