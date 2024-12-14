package com.w1ll1ann.equilibra.temperature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class FahrenheitTest {

    @Test
    public void testConversionToCelsius() {

        String expectedOutput = Fahrenheit.ABSOLUTE_ZERO + " °F is equivalent to " + Celsius.ABSOLUTE_ZERO + " °C";
        String actualOutput = Fahrenheit.convert(Fahrenheit.ABSOLUTE_ZERO, "--celsius");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToKelvin() {

        String expectedOutput = Fahrenheit.ABSOLUTE_ZERO + " °F is equivalent to " + Kelvin.ABSOLUTE_ZERO + " K";
        String actualOutput = Fahrenheit.convert(Fahrenheit.ABSOLUTE_ZERO, "--kelvin");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidConversion() {

        assertThrows(IllegalArgumentException.class, () -> Fahrenheit.convert(Fahrenheit.ABSOLUTE_ZERO - 1, "--celsius"));
        assertThrows(IllegalArgumentException.class, () -> Fahrenheit.convert(Fahrenheit.ABSOLUTE_ZERO - 1, "--kelvin"));
        assertThrows(IllegalArgumentException.class, () -> Fahrenheit.convert(0, "--null"));
    }
}