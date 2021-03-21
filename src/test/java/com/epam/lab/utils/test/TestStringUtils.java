package com.epam.lab.utils.test;

import com.epam.lab.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestStringUtils  {

    @Test
    void testString() {
        assertFalse(StringUtils.isPositiveNumber("a"));
    }

    @Test
    void testNull() {
        assertFalse(StringUtils.isPositiveNumber(null));
    }

    @Test
    void testZero() {
        assertFalse(StringUtils.isPositiveNumber("0"));
    }

    @Test
    void testNegativeInt() {
        assertFalse(StringUtils.isPositiveNumber("-12"));
    }

    @Test
    void testEmpty() {
        assertFalse(StringUtils.isPositiveNumber(""));
    }

    @Test
    void testPositiveInt() {
        assertTrue(StringUtils.isPositiveNumber("4"));
    }

    @Test
    void testPositiveDouble() {
        assertFalse(StringUtils.isPositiveNumber(Double.toString(100.34)));
    }

    @Test
    void testPositiveLong() {
        assertTrue(StringUtils.isPositiveNumber(Long.toString(1003)));
    }

}
