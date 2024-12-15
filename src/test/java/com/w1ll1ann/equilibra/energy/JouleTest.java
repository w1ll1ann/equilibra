package com.w1ll1ann.equilibra.energy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class JouleTest {

    @Test
    public void testConversionToCalorie() {

        String expectedOutput = "1 J is equivalent to 0.24 Cal";
        String actualOutput = Joule.convert("1", "--joule");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidConversion() {

        assertThrows(IllegalArgumentException.class, () -> Joule.convert("0", "--null"));
    }
}