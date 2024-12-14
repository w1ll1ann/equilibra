package com.w1ll1ann.equilibra.temperature;

public class Fahrenheit {

    public static float ABSOLUTE_ZERO = -459.67F;

    static float toCelsius(String inputValue) {

        float temperature = Float.parseFloat(inputValue);

        if (temperature  < ABSOLUTE_ZERO)
            throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

        return (temperature - 32) * 5 / 9;
    }

    static float toKelvin(String inputValue) {

        float temperature = Float.parseFloat(inputValue);

        if (temperature  < ABSOLUTE_ZERO)
            throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

        return toCelsius(Float.toString(temperature)) + 273.15F;
    }

    public static String convert(String inputValue, String conversionUnit) {

        String outputValue;

        switch (conversionUnit) {
            case "--celsius":
                outputValue = Math.round(toCelsius(inputValue) * 100) / 100.0F + " °C";
                break;
            case "--kelvin":
                outputValue = Math.round(toKelvin(inputValue) * 100) / 100.0F + " K";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --fahrenheit");
        }

        return inputValue + " °F is equivalent to " + outputValue;
    }
}