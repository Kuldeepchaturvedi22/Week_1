import java.util.Scanner;
public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input lengths of the sides of the triangular park
        System.out.print("Enter the length of side1 (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the length of side2 (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the length of side3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate the perimeter of the triangular park
        double perimeter = side1 + side2 + side3;

        // Convert the total distance to meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the number of rounds the athlete must complete
        double numberOfRounds = totalDistance / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km.");

    }
}
