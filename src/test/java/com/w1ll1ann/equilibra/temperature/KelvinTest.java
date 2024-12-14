package com.w1ll1ann.equilibra.temperature;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class KelvinTest {

    @Test
    public void testConversionToCelsius() {

        String expectedOutput = Kelvin.ABSOLUTE_ZERO + " K is equivalent to " + Celsius.ABSOLUTE_ZERO + " °C";
        String actualOutput = Kelvin.convert(Kelvin.ABSOLUTE_ZERO, "--celsius");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToFahrenheit() {

        String expectedOutput = Kelvin.ABSOLUTE_ZERO + " K is equivalent to " + Fahrenheit.ABSOLUTE_ZERO + " °F";
        String actualOutput = Kelvin.convert(Kelvin.ABSOLUTE_ZERO, "--fahrenheit");
    
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidConversion() {

        assertThrows(IllegalArgumentException.class, () -> Kelvin.convert(Kelvin.ABSOLUTE_ZERO - 1, "--celsius"));
        assertThrows(IllegalArgumentException.class, () -> Kelvin.convert(Kelvin.ABSOLUTE_ZERO - 1, "--fahrenheit"));
        assertThrows(IllegalArgumentException.class, () -> Kelvin.convert(0, "--null"));
    }
}