package com.w1ll1ann.equilibra.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class DecimalTest {

    private String testedNumber = "255";

    @Test
    public void testConversionToHexadecimal() {

        String expectedOutput = "255 base 10 is equivalent to ff base 16";
        String actualOutput = Decimal.convert(testedNumber, "--hexadecimal");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToOctal() {

        String expectedOutput = "255 base 10 is equivalent to 377 base 8";
        String actualOutput = Decimal.convert(testedNumber, "--octal");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToBinary() {

        String expectedOutput = "255 base 10 is equivalent to 11111111 base 2";
        String actualOutput = Decimal.convert(testedNumber, "--binary");

        assertEquals(expectedOutput, actualOutput);
    }
}
