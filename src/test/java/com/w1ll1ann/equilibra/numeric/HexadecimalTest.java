package com.w1ll1ann.equilibra.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class HexadecimalTest {

    private String testedNumber = "ff";

    @Test
    public void testConversionToDecimal() {

        String expectedOutput = "ff base 16 is equivalent to 255 base 10";
        String actualOutput = Hexadecimal.convert(testedNumber, "--decimal");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToOctal() {

        String expectedOutput = "ff base 16 is equivalent to 377 base 8";
        String actualOutput = Hexadecimal.convert(testedNumber, "--octal");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToBinary() {

        String expectedOutput = "ff base 16 is equivalent to 11111111 base 2";
        String actualOutput = Hexadecimal.convert(testedNumber, "--binary");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testInvalidConversion() {
        assertThrows(IllegalArgumentException.class, () -> Hexadecimal.convert("0", "--null"));
    }
}
