package com.w1ll1ann.equilibra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import static com.w1ll1ann.equilibra.Temperature.*;

import org.junit.jupiter.api.Test;

public final class TemperatureTest {

    public static final double DELTA = 0.01;

    public static final double WATER_MELTING_POINT_CELSIUS = 0.0;
    public static final double WATER_BOILING_POINT_CELSIUS = 100.0;

    public static final double WATER_MELTING_POINT_FAHRENHEIT = 32.0;
    public static final double WATER_BOILING_POINT_FAHRENHEIT = 212.0;

    public static final double WATER_MELTING_POINT_KELVIN = 273.15;
    public static final double WATER_BOILING_POINT_KELVIN = 373.15;

    @Test
    public void testConversionToCelsius() {

        assertEquals(ABSOLUTE_ZERO_CELSIUS, Kelvin.toCelsius(ABSOLUTE_ZERO_KELVIN), DELTA);
        assertEquals(ABSOLUTE_ZERO_CELSIUS, Fahrenheit.toCelsius(ABSOLUTE_ZERO_FAHRENHEIT), DELTA);

        assertEquals(WATER_MELTING_POINT_CELSIUS, Kelvin.toCelsius(WATER_MELTING_POINT_KELVIN), DELTA);
        assertEquals(WATER_MELTING_POINT_CELSIUS, Fahrenheit.toCelsius(WATER_MELTING_POINT_FAHRENHEIT), DELTA);

        assertEquals(WATER_BOILING_POINT_CELSIUS, Kelvin.toCelsius(WATER_BOILING_POINT_KELVIN), DELTA);
        assertEquals(WATER_BOILING_POINT_CELSIUS, Fahrenheit.toCelsius(WATER_BOILING_POINT_FAHRENHEIT), DELTA);
    }

    @Test
    public void testConversionToFahrenheit() {

        assertEquals(ABSOLUTE_ZERO_FAHRENHEIT, Celsius.toFahrenheit(ABSOLUTE_ZERO_CELSIUS), DELTA);
        assertEquals(ABSOLUTE_ZERO_FAHRENHEIT, Kelvin.toFahrenheit(ABSOLUTE_ZERO_KELVIN), DELTA);

        assertEquals(WATER_MELTING_POINT_FAHRENHEIT, Celsius.toFahrenheit(WATER_MELTING_POINT_CELSIUS), DELTA);
        assertEquals(WATER_MELTING_POINT_FAHRENHEIT, Kelvin.toFahrenheit(WATER_MELTING_POINT_KELVIN), DELTA);

        assertEquals(WATER_BOILING_POINT_FAHRENHEIT, Celsius.toFahrenheit(WATER_BOILING_POINT_CELSIUS), DELTA);
        assertEquals(WATER_BOILING_POINT_FAHRENHEIT, Kelvin.toFahrenheit(WATER_BOILING_POINT_KELVIN), DELTA);
    }

    @Test
    public void testConversionToKelvin() {
    
        assertEquals(ABSOLUTE_ZERO_KELVIN, Celsius.toKelvin(ABSOLUTE_ZERO_CELSIUS), DELTA);
        assertEquals(ABSOLUTE_ZERO_KELVIN, Fahrenheit.toKelvin(ABSOLUTE_ZERO_FAHRENHEIT), DELTA);

        assertEquals(WATER_MELTING_POINT_KELVIN, Celsius.toKelvin(WATER_MELTING_POINT_CELSIUS), DELTA);
        assertEquals(WATER_MELTING_POINT_KELVIN, Fahrenheit.toKelvin(WATER_MELTING_POINT_FAHRENHEIT), DELTA);

        assertEquals(WATER_BOILING_POINT_KELVIN, Celsius.toKelvin(WATER_BOILING_POINT_CELSIUS), DELTA);
        assertEquals(WATER_BOILING_POINT_KELVIN, Fahrenheit.toKelvin(WATER_BOILING_POINT_FAHRENHEIT), DELTA);
    }

    @Test
    public void testInvalidTemperature() {

        assertThrows(IllegalArgumentException.class, () -> Celsius.toFahrenheit(ABSOLUTE_ZERO_CELSIUS - 1));
        assertThrows(IllegalArgumentException.class, () -> Celsius.toKelvin(ABSOLUTE_ZERO_CELSIUS - 1));

        assertThrows(IllegalArgumentException.class, () -> Fahrenheit.toCelsius(ABSOLUTE_ZERO_FAHRENHEIT - 1));
        assertThrows(IllegalArgumentException.class, () -> Fahrenheit.toKelvin(ABSOLUTE_ZERO_FAHRENHEIT - 1));

        assertThrows(IllegalArgumentException.class, () -> Kelvin.toCelsius(ABSOLUTE_ZERO_KELVIN - 1));
        assertThrows(IllegalArgumentException.class, () -> Kelvin.toFahrenheit(ABSOLUTE_ZERO_KELVIN - 1));
    }
}