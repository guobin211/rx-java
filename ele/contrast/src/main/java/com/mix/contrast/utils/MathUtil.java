package com.mix.contrast.utils;

/**
 * @author guobin211
 * @version 0.0.1
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    public static boolean equals(double d1, double d2) {
        return Math.abs(d1 - d2) <= MONEY_RANGE;
    }
}
