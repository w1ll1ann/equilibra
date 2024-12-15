package com.w1ll1ann.equilibra.numeric;

public class Decimal {

    static String toBinary(String inputValue) {

        long number = Long.parseLong(inputValue);

        return Long.toBinaryString(number);
    }

    static String toHexadecimal(String inputValue) {

        long number = Long.parseLong(inputValue);

        return Long.toHexString(number); 
    }

    static String toOctal(String inputValue) {

        long number = Long.parseLong(inputValue);

        return Long.toOctalString(number);
    }

    public static String convert(String inputValue, String conversionUnit) {

        String outputValue;

        switch (conversionUnit) {
            case "--binary":
                outputValue = toBinary(inputValue) + " base 2";
                break;
            case "--hexadecimal":
                outputValue = toHexadecimal(inputValue) + " base 16";
                break;
            case "--octal":
                outputValue = toOctal(inputValue) + " base 8";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --decimal"); 
        }

        return inputValue + " base 10 is equivalent to " + outputValue;
    }
}