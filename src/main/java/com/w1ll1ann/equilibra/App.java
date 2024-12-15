package com.w1ll1ann.equilibra;

import com.w1ll1ann.equilibra.energy.*;
import com.w1ll1ann.equilibra.numeric.*;
import com.w1ll1ann.equilibra.speed.*;
import com.w1ll1ann.equilibra.temperature.*;

public class App {

    public static void printHelp() {

        System.out.println("\nCorrect usage: java -jar equilibra-0.1.0.jar [unit value] [original unit type] [converted unit type]");

        System.out.println("\nSupported unit types:");
        System.out.println("    Energy:");
        System.out.println("        --calorie");
        System.out.println("        --joule");
        System.out.println("    Numeric:");
        System.out.println("        --binary");
        System.out.println("        --decimal");
        System.out.println("        --hexadecimal");
        System.out.println("        --octal");
        System.out.println("    Speed:");
        System.out.println("        --kilometerhour");
        System.out.println("        --metersecond");
        System.out.println("    Temperature:");
        System.out.println("        --celsius");
        System.out.println("        --fahrenheit");
        System.out.println("        --kelvin");
    }

    public static void main(String[] args) {

        System.out.println("Equilibra 0.4.0");

        if (args.length != 3) {
            printHelp();
            return;
        }

        switch (args[1]) {
            case "--calorie":
                System.out.println(Calorie.convert(args[0], args[2]));
                break;
            case "--joule":
                System.out.println(Joule.convert(args[0], args[2]));
                break;
            case "--binary":
                System.out.println(Binary.convert(args[0], args[2]));
                break;
            case "--decimal":
                System.out.println(Decimal.convert(args[0], args[2]));
                break;
            case "--hexadecimal":
                System.out.println(Hexadecimal.convert(args[0], args[2]));
                break;
            case "--octal":
                System.out.println(Octal.convert(args[0], args[2]));
                break;
            case "--kilometerhour":
                System.out.println(KilometerHour.convert(args[0], args[2]));
                break;
            case "--metersecond":
                System.out.println(MeterSecond.convert(args[0], args[2]));
                break;
            case "--celsius":
                System.out.println(Celsius.convert(args[0], args[2]));
                break;
            case "--fahrenheit":
                System.out.println(Fahrenheit.convert(args[0], args[2]));
                break;
            case "--kelvin":
                System.out.println(Kelvin.convert(args[0], args[2]));
                break;
            default:
                throw new IllegalArgumentException("Unit type entered (" + args[2] + ") is not supported!");
        }
    }
}
