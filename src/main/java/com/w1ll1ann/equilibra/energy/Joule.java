package com.w1ll1ann.equilibra.energy;

public class Joule {

    public static float toCalorie(String inputValue) {

        float energy = Float.parseFloat(inputValue);

        return energy * 0.24F;
    }

    public static String convert(String inputValue, String conversionUnit) {

        String outputValue;

        switch (conversionUnit) {
            case "--calorie":
                outputValue = Math.round(toCalorie(inputValue) * 100) / 100.F + " Cal";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --joule");
        }

        return inputValue + " J is equivalent to " + outputValue;
    }
}