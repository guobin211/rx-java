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

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String codeToMessage(int code) {
        switch (code) {
            case 0:
                return "等待支付";
            case 1:
                return "支付成功";
            case 2:
                return "支付失败";
        }
        return null;
    }

    @Override
    public Integer messageToCode(String message) {
        switch (message) {
            case "等待支付":
                return 0;
            case "支付成功":
                return 1;
            case "支付失败":
                return 2;
        }
        return null;
    }
}
