package com.w1ll1ann.equilibra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public final class TemperatureTest {

    private static final double DELTA = 0.01;

    private static final double ABSOLUTE_ZERO_CELSIUS = -273.15;
    private static final double WATER_MELTING_POINT_CELSIUS = 0.0;
    private static final double WATER_BOILING_POINT_CELSIUS = 100.0;

    private static final double ABSOLUTE_ZERO_FAHRENHEIT = -459.67;
    private static final double WATER_MELTING_POINT_FAHRENHEIT = 32.0;
    private static final double WATER_BOILING_POINT_FAHRENHEIT = 212.0;

    private static final double ABSOLUTE_ZERO_KELVIN = 0.0;
    private static final double WATER_MELTING_POINT_KELVIN = 273.15;
    private static final double WATER_BOILING_POINT_KELVIN = 373.15;

    @Test
    public void testConversionToCelsius() {

        assertEquals(ABSOLUTE_ZERO_CELSIUS, Temperature.Kelvin.convertToCelsius(ABSOLUTE_ZERO_KELVIN), DELTA);
        assertEquals(ABSOLUTE_ZERO_CELSIUS, Temperature.Fahrenheit.convertToCelsius(ABSOLUTE_ZERO_FAHRENHEIT), DELTA);

        assertEquals(WATER_MELTING_POINT_CELSIUS, Temperature.Kelvin.convertToCelsius(WATER_MELTING_POINT_KELVIN), DELTA);
        assertEquals(WATER_MELTING_POINT_CELSIUS, Temperature.Fahrenheit.convertToCelsius(WATER_MELTING_POINT_FAHRENHEIT), DELTA);

        assertEquals(WATER_BOILING_POINT_CELSIUS, Temperature.Kelvin.convertToCelsius(WATER_BOILING_POINT_KELVIN), DELTA);
        assertEquals(WATER_BOILING_POINT_CELSIUS, Temperature.Fahrenheit.convertToCelsius(WATER_BOILING_POINT_FAHRENHEIT), DELTA);
    }

    @Test
    public void testConversionToFahrenheit() {

        assertEquals(ABSOLUTE_ZERO_FAHRENHEIT, Temperature.Celsius.convertToFahrenheit(ABSOLUTE_ZERO_CELSIUS), DELTA);
        assertEquals(ABSOLUTE_ZERO_FAHRENHEIT, Temperature.Kelvin.convertToFahrenheit(WATER_MELTING_POINT_CELSIUS), DELTA);

        assertEquals(WATER_MELTING_POINT_FAHRENHEIT, Temperature.Celsius.convertToFahrenheit(WATER_MELTING_POINT_CELSIUS), DELTA);
        assertEquals(WATER_MELTING_POINT_FAHRENHEIT, Temperature.Kelvin.convertToFahrenheit(WATER_MELTING_POINT_KELVIN), DELTA);

        assertEquals(WATER_BOILING_POINT_FAHRENHEIT, Temperature.Celsius.convertToFahrenheit(WATER_BOILING_POINT_CELSIUS), DELTA);
        assertEquals(WATER_BOILING_POINT_FAHRENHEIT, Temperature.Kelvin.convertToFahrenheit(WATER_MELTING_POINT_KELVIN), DELTA);
    }

    @Test
    public void testConversionToKelvin() {
    
        assertEquals(ABSOLUTE_ZERO_KELVIN, Temperature.Celsius.convertToKelvin(ABSOLUTE_ZERO_CELSIUS), DELTA);
        assertEquals(ABSOLUTE_ZERO_KELVIN, Temperature.Fahrenheit.convertToKelvin(ABSOLUTE_ZERO_FAHRENHEIT), DELTA);

        assertEquals(WATER_MELTING_POINT_KELVIN, Temperature.Celsius.convertToKelvin(WATER_MELTING_POINT_CELSIUS), DELTA);
        assertEquals(WATER_MELTING_POINT_KELVIN, Temperature.Fahrenheit.convertToKelvin(WATER_MELTING_POINT_FAHRENHEIT), DELTA);

        assertEquals(WATER_BOILING_POINT_KELVIN, Temperature.Celsius.convertToKelvin(WATER_BOILING_POINT_CELSIUS), DELTA);
        assertEquals(WATER_BOILING_POINT_KELVIN, Temperature.Fahrenheit.convertToKelvin(WATER_BOILING_POINT_FAHRENHEIT), DELTA);
    }
}