package com.Cat.excerice.exceptions;

import lombok.Getter;

@Getter
public enum ErrMsg {
    ID_NOT_FOUND("id not found"),
    ID_ALREADY_EXISTS("id already exists"),
    WEIGHT_ERROR("weight error"),
    CAT_NOT_FOUND("cat not found");


    private String msg;

    ErrMsg(String msg) {
        this.msg = msg;
    }
}
