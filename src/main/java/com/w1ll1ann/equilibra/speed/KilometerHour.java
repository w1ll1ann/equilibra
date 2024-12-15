package com.w1ll1ann.equilibra.speed;

public class KilometerHour {

    public static float toMeterSecond(String inputValue) {

        float speed = Float.parseFloat(inputValue);

        return speed * 0.36F;
    }

    public static String convert(String inputValue, String conversionUnit) {

        String outputValue;

        switch (conversionUnit) {
            case "--metersecond":
                outputValue = Math.round(toMeterSecond(inputValue) * 100) / 100.F + " m/s";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --kilometerhour");
        }

        return inputValue + " Km/h is equivalent to " + outputValue;
    }
}