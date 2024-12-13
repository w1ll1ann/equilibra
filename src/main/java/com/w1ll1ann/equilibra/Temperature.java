package com.w1ll1ann.equilibra;

public final class Temperature {

    public static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
    public static final double ABSOLUTE_ZERO_FAHRENHEIT = -459.67;
    public static final double ABSOLUTE_ZERO_KELVIN = 0.0;

    public static final class Celsius {

        public static double toKelvin(double degrees) {

            if (degrees  < ABSOLUTE_ZERO_CELSIUS)
                throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

            return degrees + 273.15;
        }

        public static double toFahrenheit(double degrees) {

            if (degrees  < ABSOLUTE_ZERO_CELSIUS)
                throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

            return degrees * 1.8 + 32;
        }
    }

    public static final class Fahrenheit {

        public static double toCelsius(double degrees) {

            if (degrees  < ABSOLUTE_ZERO_FAHRENHEIT)
                throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

            return (degrees - 32) * 5 / 9;
        }

        public static double toKelvin(double degrees) {

            if (degrees  < ABSOLUTE_ZERO_FAHRENHEIT)
                throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

            return toCelsius(degrees) + 273.15;
        }
    }

    public static final class Kelvin {

        public static double toCelsius(double degrees) {

            if (degrees  < ABSOLUTE_ZERO_KELVIN)
                throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

            return degrees - 273.15;
        }

        public static double toFahrenheit(double degrees) {

            if (degrees  < ABSOLUTE_ZERO_KELVIN)
                throw new IllegalArgumentException("Temperature entered is bellow absolute zero!");

            return Celsius.toFahrenheit(degrees - 273.15);
        }
    }
}