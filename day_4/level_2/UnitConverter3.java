import java.util.*;
public class UnitConverter3 {

    // Method to convert Fahrenheit to Celsius and return the value
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit and return the value
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms and return the value
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds and return the value
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters and return the value
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons and return the value
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for Fahrenheit
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        // Take input for Celsius
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        // Take input for pounds
        System.out.print("Enter the weight in pounds: ");
        double pounds = sc.nextDouble();

        // Take input for kilograms
        System.out.print("Enter the weight in kilograms: ");
        double kilograms = sc.nextDouble();

        // Take input for gallons
        System.out.print("Enter the volume in gallons: ");
        double gallons = sc.nextDouble();

        // Take input for liters
        System.out.print("Enter the volume in liters: ");
        double liters = sc.nextDouble();

        // Convert Fahrenheit to Celsius and display the value
        System.out.println("Temperature in Celsius: " + convertFahrenheitToCelsius(fahrenheit));

        // Convert Celsius to Fahrenheit and display the value
        System.out.println("Temperature in Fahrenheit: " + convertCelsiusToFahrenheit(celsius));

        // Convert pounds to kilograms and display the value
        System.out.println("Weight in kilograms: " + convertPoundsToKilograms(pounds));

        // Convert kilograms to pounds and display the value
        System.out.println("Weight in pounds: " + convertKilogramsToPounds(kilograms));

        // Convert gallons to liters and display the value
        System.out.println("Volume in liters: " + convertGallonsToLiters(gallons));

        // Convert liters to gallons and display the value
        System.out.println("Volume in gallons: " + convertLitersToGallons(liters));

        // Close Scanner
        sc.close();
    }
}
