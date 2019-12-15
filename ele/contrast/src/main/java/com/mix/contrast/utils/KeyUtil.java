package com.mix.contrast.utils;

import java.util.Random;

/**
 * @author guobin211
 * @version 0.0.1
 */
public class KeyUtil {

    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
