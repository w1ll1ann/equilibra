package com.w1ll1ann.equilibra.energy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalorieTest {

    @Test
    public void testConversionToJoule() {

        String expectedOutput = "1 Cal is equivalent to 4.18 J";
        String actualOutput = Calorie.convert("1", "--joule");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidConversion() {

        assertThrows(IllegalArgumentException.class, () -> Calorie.convert("0", "--null"));
    }
}