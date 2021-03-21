package com.epam.lab.utils;


public class StringUtils {

    public static boolean isPositiveNumber(String str) {

        if (org.apache.commons.lang3.StringUtils.isNumeric(str)) {
            return Double.parseDouble(str) > 0;
        } else {
            return false;
        }
    }
}
