package com.mix.contrast.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author guobin211
 * @version 0.0.1
 */
public class JsonUtil {

    public static String toJson(Object object) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setPrettyPrinting();
        Gson gson = gsonBuilder.create();
        return gson.toJson(object);
    }
}
