package com.w1ll1ann.equilibra;

public class App {

    public static void printHelp() {

        System.out.println("\nCorrect usage: java -jar equilibra-0.1.0.jar [unit value] [original unit type] [converted unit type]");

        System.out.println("\nSupported unit types:");
        System.out.println("    Temperature:");
        System.out.println("        --celsius");
        System.out.println("        --fahrenheit");
        System.out.println("        --kelvin");
    }

    public static String handleTemperatureCelsius(double inputValue, String convertTo) {
    
        String outputValue;

        switch (convertTo) {
            case "--fahrenheit":
                outputValue = Double.toString(Temperature.Celsius.toFahrenheit(inputValue)) + " °F";
                break;
            case "--kelvin":
                outputValue = Double.toString(Temperature.Celsius.toKelvin(inputValue)) + " K";
                break;
            default:
                throw new IllegalArgumentException("Incompatible conversion unit type!");
        }

        return Double.toString(inputValue) + " °C is equivalent to " + outputValue;
    }

    public static String handleTemperatureFahrenheit(double inputValue, String convertTo) {

        String outputValue;

        switch (convertTo) {
            case "--celsius":
                outputValue = Double.toString(Temperature.Fahrenheit.toCelsius(inputValue)) + " °C";
                break;
            case "--kelvin":
                outputValue = Double.toString(Temperature.Fahrenheit.toKelvin(inputValue)) + " K";
                break;
            default:
                throw new IllegalArgumentException("Incompatible conversion unit type!");
        }

        return Double.toString(inputValue) + " °F is equivalent to " + outputValue;
    }

    public static String handleTemperatureKelvin(double inputValue, String convertTo) {
        String outputValue;

        switch (convertTo) {
            case "--celsius":
                outputValue = Double.toString(Temperature.Kelvin.toCelsius(inputValue)) + " °C";
                break;
            case "--fahrenheit":
                outputValue = Double.toString(Temperature.Kelvin.toFahrenheit(inputValue)) + " °F";
                break;
            default:
                throw new IllegalArgumentException("Incompatible conversion unit type!");
        }

        return Double.toString(inputValue) + " K is equivalent to " + outputValue;
    }

    public static void main(String[] args) {

        System.out.println("Equilibra 0.1.0");

        if (args.length != 3) {
            printHelp();
            return;
        }

        double inputValue = Double.parseDouble(args[0]);
        String output;

        switch (args[1]) {
            case "--celsius":
                output = handleTemperatureCelsius(inputValue, args[2]);
                break;
            case "--fahrenheit":
                output = handleTemperatureFahrenheit(inputValue, args[2]);
                break;
            case "--kelvin":
                output = handleTemperatureKelvin(inputValue, args[2]);
                break;
            default:
                throw new IllegalArgumentException("Unit type entered is not supported!");
        }

        System.out.println(output);
    }
}
