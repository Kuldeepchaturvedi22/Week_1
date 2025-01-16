import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to choose the conversion type
        System.out.print("Enter 'C' to convert from Celsius to Fahrenheit or 'F' to convert from Fahrenheit to Celsius: ");
        char conversionType = scanner.next().toUpperCase().charAt(0);
        
        // Variable to store the input temperature
        double inputTemperature;
        // Variable to store the converted temperature
        double convertedTemperature;

        if (conversionType == 'C') {
            // Prompt user to enter temperature in Celsius
            System.out.print("Enter temperature in Celsius: ");
            inputTemperature = scanner.nextDouble();
            // Convert Celsius to Fahrenheit
            convertedTemperature = celsiusToFahrenheit(inputTemperature);
            // Display the result
            System.out.println(inputTemperature + " Celsius is equal to " + convertedTemperature + " Fahrenheit.");
        } else if (conversionType == 'F') {
            // Prompt user to enter temperature in Fahrenheit
            System.out.print("Enter temperature in Fahrenheit: ");
            inputTemperature = scanner.nextDouble();
            // Convert Fahrenheit to Celsius
            convertedTemperature = fahrenheitToCelsius(inputTemperature);
            // Display the result
            System.out.println(inputTemperature + " Fahrenheit is equal to " + convertedTemperature + " Celsius.");
        } else {
            System.out.println("Invalid input. Please enter 'C' or 'F'.");
        }

        // Close the Scanner object
        scanner.close();
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}