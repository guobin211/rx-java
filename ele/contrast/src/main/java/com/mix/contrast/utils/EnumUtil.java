package com.mix.contrast.utils;

import com.mix.contrast.enums.CodeEnum;
import com.mix.contrast.enums.GoodsStatusEnum;
import com.mix.contrast.enums.PayStatusEnum;

/**
 * @author guobin211
 * @version 0.0.1
 */
public class EnumUtil {

    private static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass) {
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

        GoodsStatusEnum goodsStatusEnum = EnumUtil.getByCode(11, GoodsStatusEnum.class);
        assert goodsStatusEnum != null;
        System.out.println(goodsStatusEnum.getMessage());
    }
}
