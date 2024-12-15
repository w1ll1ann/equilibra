package com.w1ll1ann.equilibra.numeric;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class BinaryTest {

    private String testedNumber = "11111111";

    @Test
    public void testConversionToDecimal() {

        String expectedOutput = "11111111 base 2 is equivalent to 255 base 10";
        String actualOutput = Binary.convert(testedNumber, "--decimal");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToHexadecimal() {

        String expectedOutput = "11111111 base 2 is equivalent to ff base 16";
        String actualOutput = Binary.convert(testedNumber, "--hexadecimal");

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testConversionToOctal() {

        String expectedOutput = "11111111 base 2 is equivalent to 377 base 8";
        String actualOutput = Binary.convert(testedNumber, "--octal");

        assertEquals(expectedOutput, actualOutput);
    }
}
