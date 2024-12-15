package com.w1ll1ann.equilibra.speed;

public class MeterSecond {

    public static float toKilometerHour(String inputValue) {

        float speed = Float.parseFloat(inputValue);

        return speed * 3.6F;
    }

    public static String convert(String inputValue, String conversionUnit) {

        String outputValue;

        switch (conversionUnit) {
            case "--kilometerhour":
                outputValue = Math.round(toKilometerHour(inputValue) * 100) / 100.F + " Km/h";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --metersecond");
        }

        return inputValue + " m/s is equivalent to " + outputValue;
    }
}