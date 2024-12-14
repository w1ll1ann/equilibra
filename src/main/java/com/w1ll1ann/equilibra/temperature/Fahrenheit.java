package com.w1ll1ann.equilibra.temperature;

public class Fahrenheit {

    public static float ABSOLUTE_ZERO = -459.67F;

    static float toCelsius(float temperature) {

        if (temperature  < ABSOLUTE_ZERO)
            throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

        return (temperature - 32) * 5 / 9;
    }

    static float toKelvin(float temperature) {

        if (temperature  < ABSOLUTE_ZERO)
            throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

        return toCelsius(temperature) + 273.15F;
    }

    public static String convert(float inputValue, String conversionUnit) {

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

        return Float.toString(inputValue) + " °F is equivalent to " + outputValue;
    }
}