package com.mix.contrast.enums;

/**
 * @author guobin211
 * @version 0.0.1
 */
public interface CodeEnum {
    Integer getCode();
    String getMessage();
    String codeToMessage(int code);
    Integer messageToCode(String message);
}
