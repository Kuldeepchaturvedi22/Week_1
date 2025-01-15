import java.util.*;
public class BMICalculator {
    public static void main(String[] args) {
        // Create a 2D array to store weight and height of 10 persons
        double[][] data = new double[10][2];
        Scanner input = new Scanner(System.in);

        // Collecting user input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            System.out.println("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI and status for each person
        String[][] result = computeBMIAndStatus(data);

        // Display the results in a tabular format
        displayBMITable(result);
    }

    // Method to compute BMI and status
    public static String[][] computeBMIAndStatus(double[][] data) {
        String[][] result = new String[10][4];
        
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1] / 100; // Convert height to meters
            double bmi = weight / (height * height);
            String status = getStatus(bmi);

            result[i][0] = Double.toString(weight);
            result[i][1] = Double.toString(height * 100); // Convert back to cm for display
            result[i][2] = Double.toString(bmi);
            result[i][3] = status;
        }
        
        return result;
    }

    // Method to determine BMI status
    public static String getStatus(double bmi) {
        if (bmi <= 18.4) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 39.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to display the BMI table
    public static void displayBMITable(String[][] data) {
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + data[i][3]);
        }
    }
}
