package com.w1ll1ann.equilibra.temperature;

public class Celsius {

    public static float ABSOLUTE_ZERO = -273.15F;

    static float toKelvin(float temperature) {

        if (temperature  < ABSOLUTE_ZERO)
            throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

        return temperature + 273.15F;
    }

    static float toFahrenheit(float temperature) {

        if (temperature  < ABSOLUTE_ZERO)
            throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

        return temperature * 1.8F + 32;
    }

    public static String convert(float inputValue, String conversionUnit) {

        String outputValue;

        switch (conversionUnit) {
            case "--kelvin":
                outputValue = Math.round(toKelvin(inputValue) * 100) / 100.0F + " K";
                break;
            case "--fahrenheit":
                outputValue = Math.round(toFahrenheit(inputValue) * 100) / 100.0F + " °F";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --celsius");
        }

        return Float.toString(inputValue) + " °C is equivalent to " + outputValue;
    }
}