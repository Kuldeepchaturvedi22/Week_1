import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        // Create an input object to take user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

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

            System.out.print("Enter the height (in meters) of person " + (i + 1) + ": ");
            personData[i][1] = input.nextDouble();
            while (personData[i][1] <= 0) {
                System.out.print("Invalid input. Enter a positive height (in meters) for person " + (i + 1) + ": ");
                personData[i][1] = input.nextDouble();
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {
            double weight = personData[i][0];
            double height = personData[i][1];
            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display height, weight, BMI, and weight status of each person
        System.out.println("Height (m)  Weight (kg)  BMI    Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(personData[i][1] + "       " + personData[i][0] + "        " + personData[i][2] + "    " + weightStatus[i]);
        }

        // Close the input
        input.close();
    }
}
