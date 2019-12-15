package com.mix.contrast.utils;

import com.mix.contrast.enums.CodeEnum;
import com.mix.contrast.enums.PayStatusEnum;
import com.sun.org.apache.bcel.internal.classfile.InnerClass;

/**
 * @author guobin211
 * @version 0.0.1
 */
public class EnumUtil {

    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
        for (T each: enumClass.getEnumConstants()) {
            if (code.equals(each.getCode())) {
                return each;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Integer wait = 0;
        PayStatusEnum res = EnumUtil.getByCode(wait, PayStatusEnum.class);
        assert res != null;
        System.out.println(res.getMessage());
    }
}
