package com.w1ll1ann.equilibra.numeric;

public class Octal {

    static String toBinary(String inputValue) {

        long number = Long.parseLong(inputValue, 8);

        return Long.toBinaryString(number);
    }

    static String toDecimal(String inputValue) {

        long number = Long.parseLong(inputValue, 8);

        return Long.toString(number);
    }

    static String toHexadecimal(String inputValue) {

        long number = Long.parseLong(inputValue, 8);

        return Long.toHexString(number);
    }

    public static String convert(String inputValue, String conversionUnit) {

        String outputValue;

        switch (conversionUnit) {
            case "--binary":
                outputValue = toBinary(inputValue) + " base 2";
                break;
            case "--decimal":
                outputValue = toDecimal(inputValue) + " base 10";
                break;
            case "--hexadecimal":
                outputValue = toHexadecimal(inputValue) + " base 16";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --octal"); 
        }

        return inputValue + " base 8 is equivalent to " + outputValue;
    }
}