package com.w1ll1ann.equilibra.speed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class MeterSecondTest {

    @Test
    public void testConversionToKilometerHour() {

        String expectedOutput = "1 m/s is equivalent to 3.6 Km/h";
        String actualOutput = MeterSecond.convert("1", "--kilometerhour");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidConversion() {

        assertThrows(IllegalArgumentException.class, () -> MeterSecond.convert("0", "--null"));
    }
}