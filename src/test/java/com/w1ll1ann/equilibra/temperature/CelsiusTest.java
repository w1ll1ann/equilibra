package com.w1ll1ann.equilibra.temperature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CelsiusTest {

    @Test
    public void testConversionToKelvin() {

        String expectedOutput = Celsius.ABSOLUTE_ZERO + " °C is equivalent to " + Kelvin.ABSOLUTE_ZERO + " K";
        String actualOutput = Celsius.convert(Celsius.ABSOLUTE_ZERO, "--kelvin");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToFahrenheit() {

        String expectedOutput = Celsius.ABSOLUTE_ZERO + " °C is equivalent to " + Fahrenheit.ABSOLUTE_ZERO + " °F";
        String actualOutput = Celsius.convert(Celsius.ABSOLUTE_ZERO, "--fahrenheit");
    
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidConversion() {

        assertThrows(IllegalArgumentException.class, () -> Celsius.convert(Celsius.ABSOLUTE_ZERO - 1, "--kelvin"));
        assertThrows(IllegalArgumentException.class, () -> Celsius.convert(Celsius.ABSOLUTE_ZERO - 1, "--fahrenheit"));
        assertThrows(IllegalArgumentException.class, () -> Celsius.convert(0, "--null"));
    }
}