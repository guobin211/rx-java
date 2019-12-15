package com.mix.contrast.structural;

import com.mix.contrast.utils.JsonUtil;

/**
 * @author guobin211
 * @version 0.0.1
 */
public class Stringify {

    public Integer code;
    public String name;

    Stringify(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Stringify{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Stringify stringify = new Stringify(10, "jack");
        System.out.println(stringify);
        System.out.println(JsonUtil.toJson(stringify));
    }
}
