package com.w1ll1ann.equilibra;

import com.w1ll1ann.equilibra.temperature.Celsius;
import com.w1ll1ann.equilibra.temperature.Fahrenheit;
import com.w1ll1ann.equilibra.temperature.Kelvin;

public class App {

    public static void printHelp() {

        System.out.println("\nCorrect usage: java -jar equilibra-0.1.0.jar [unit value] [original unit type] [converted unit type]");

        System.out.println("\nSupported unit types:");
        System.out.println("    Temperature:");
        System.out.println("        --celsius");
        System.out.println("        --fahrenheit");
        System.out.println("        --kelvin");
    }

    public static void main(String[] args) {

        System.out.println("Equilibra 0.1.0");

        if (args.length != 3) {
            printHelp();
            return;
        }

        float inputValue = Float.parseFloat(args[0]);

        String output;

        switch (args[1]) {
            case "--celsius":
                output = Celsius.convert(inputValue, args[2]);
                break;
            case "--fahrenheit":
                output = Fahrenheit.convert(inputValue, args[2]);
                break;
            case "--kelvin":
                output = Kelvin.convert(inputValue, args[2]);
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + args[2] + ") is not supported!");
        }

        System.out.println(output);
    }
}
