package com.w1ll1ann.equilibra.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class OctalTest {

    private String testedNumber = "0377";

    @Test
    public void testConversionToDecimal() {

        String expectedOutput = "0377 base 8 is equivalent to 255 base 10";
        String actualOutput = Octal.convert(testedNumber, "--decimal");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToHexadecimal() {

        String expectedOutput = "0377 base 8 is equivalent to ff base 16";
        String actualOutput = Octal.convert(testedNumber, "--hexadecimal");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToBinary() {

        String expectedOutput = "0377 base 8 is equivalent to 11111111 base 2";
        String actualOutput = Octal.convert(testedNumber, "--binary");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidConversion() {
        assertThrows(IllegalArgumentException.class, () -> Octal.convert("0", "--null"));
    }
}
