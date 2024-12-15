package com.w1ll1ann.equilibra.energy;

public class Calorie {

    public static float toJoule(String inputValue) {
        
        float energy = Float.parseFloat(inputValue);

        return energy * 4.18F;
    }

    public static String convert(String inputValue, String conversionUnit) {

        String outputValue;

        switch (conversionUnit) {
            case "--joule":
                outputValue = Math.round(toJoule(inputValue) * 100) / 100.F + " J";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --calorie");
        }

        return inputValue + " Cal is equivalent to " + outputValue;
    }
}