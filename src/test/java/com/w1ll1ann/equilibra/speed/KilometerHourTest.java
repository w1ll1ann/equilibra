package com.w1ll1ann.equilibra.speed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class KilometerHourTest {

    @Test
    public void testConversionToMeterSecond() {

        String expectedOutput = "1 Km/h is equivalent to 0.36 m/s";
        String actualOutput = KilometerHour.convert("1", "--metersecond");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidConversion() {

        assertThrows(IllegalArgumentException.class, () -> KilometerHour.convert("0", "--null"));
    }
}