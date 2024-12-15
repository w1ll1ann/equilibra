package com.w1ll1ann.equilibra.numeric;

public class Binary {

    static String toDecimal(String inputValue) {

        long number = Long.parseLong(inputValue, 2);

        return Long.toString(number);
    }

    static String toHexadecimal(String inputValue) {

        long number = Long.parseLong(inputValue, 2);

        return Long.toHexString(number); 
    }

    static String toOctal(String inputValue) {
    
        long number = Long.parseLong(inputValue, 2);

        return Long.toOctalString(number);
    }

    public static String convert(String inputValue, String conversionUnit) {
        
        String outputValue;

        switch (conversionUnit) {
            case "--decimal":
                outputValue = toDecimal(inputValue) + " base 10";
                break;
            case "--hexadecimal":
                outputValue = toHexadecimal(inputValue) + " base 16";
                break;
            case "--octal":
                outputValue = toOctal(inputValue) + " base 8";
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + conversionUnit + ") is incompatible with --binary"); 
        }

        return inputValue + " base 2 is equivalent to " + outputValue;
    }
}