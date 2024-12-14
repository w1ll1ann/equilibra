package com.w1ll1ann.equilibra.temperature;

public class Kelvin {

    public static float ABSOLUTE_ZERO = 0.00F;

    static float toCelsius(float temperature) {

        if (temperature  < ABSOLUTE_ZERO)
            throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

        return temperature - 273.15F;
    }

    static float toFahrenheit(float temperature) {

        if (temperature  < ABSOLUTE_ZERO)
            throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

        return Celsius.toFahrenheit(temperature - 273.15F);
    }

    public static String convert(float inputValue, String conversionUnit) {

        String outputValue;

        switch (conversionUnit) {
            case "--celsius":
                outputValue = Math.round(toCelsius(inputValue) * 100) / 100.0F + " °C";
                break;
            case "--fahrenheit":
                outputValue = Math.round(toFahrenheit(inputValue) * 100) / 100.0F + " °F";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --kelvin");
        }

        return Float.toString(inputValue) + " K is equivalent to " + outputValue;
    }
}