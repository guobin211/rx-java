package com.mix.contrast.enums;

/**
 * com.mix.contrast.enums
 *
 * @author guobin211
 * @version 0.0.1
 * @date 2020-01-30 at 20:29
 */
public enum GoodsStatusEnum implements CodeEnum {
    ONLINE(11, "在售"),
    OFFLINE(12, "下架"),
    OUT_OF_STOCK(13, "缺货");

    private Integer code;

    private String message;

    GoodsStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String codeToMessage(int code) {
        return null;
    }

    @Override
    public Integer messageToCode(String message) {
        return null;
    }
}
