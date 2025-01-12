import java.util.*;
public class BMI {

    // Method to find the BMI of a person
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // Convert cm to meters
        return weight / (heightM * heightM); // BMI formula
    }

    // Method to determine the BMI status
    public static String determineBMIStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfPersons = 10;

        // Create a multi-dimensional array to store weight, height, and BMI
        double[][] personData = new double[numberOfPersons][3];
        // Create an array to store weight status
        String[] weightStatus = new String[numberOfPersons];

        // Take input for weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter the weight (in kg) of person " + (i + 1) + ": ");
            personData[i][0] = input.nextDouble();
            while (personData[i][0] <= 0) {
                System.out.print("Invalid input. Enter a positive weight (in kg) for person " + (i + 1) + ": ");
                personData[i][0] = input.nextDouble();
            }

            System.out.print("Enter the height (in cm) of person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Invalid input. Enter a positive height (in cm) for person " + (i + 1) + ": ");
                personData[i][1] = input.nextDouble();
            }
        }

        // Calculate BMI and determine weight status for each person
        for (int i = 0; i < numberOfPersons; i++) {
            double weight = personData[i][0];
            double heightCm = personData[i][1];
            double bmi = calculateBMI(weight, heightCm);
            personData[i][2] = bmi;
            weightStatus[i] = determineBMIStatus(bmi);
        }

        // Display height, weight, BMI, and weight status of each person
        System.out.println("Height (cm)  Weight (kg)  BMI    Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(personData[i][1] + "         " + personData[i][0] + "         " + personData[i][2] + "    " + weightStatus[i]);
        }

        // Close the input
        input.close();
    }
}
