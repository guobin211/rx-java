package com.mix.contrast.enums;


/**
 * @author guobin211
 * @version 0.0.1
 */
public enum PayStatusEnum implements CodeEnum {
    PAY_WAIT(0, "等待支付"),
    PAY_SUCCESS(1, "支付成功"),
    PAY_FAIL(2, "支付失败");

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return this.code;
    }

    public String getMessage() {
        return message;
    }
}
