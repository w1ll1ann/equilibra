package com.w1ll1ann.equilibra.numeric;

public class Hexadecimal {

    static String toBinary(String inputValue) {
        
        long number = Long.parseLong(inputValue, 16);

        return Long.toBinaryString(number);
    }

    static String toDecimal(String inputValue) {

        long number = Long.parseLong(inputValue, 16);

        return Long.toString(number);
    }

    static String toOctal(String inputValue) {

        long number = Long.parseLong(inputValue, 16);

        return Long.toOctalString(number);
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
            case "--octal":
                outputValue = toOctal(inputValue) + " base 8";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --hexadecimal"); 
        }

        return inputValue + " base 16 is equivalent to " + outputValue;
    }
}