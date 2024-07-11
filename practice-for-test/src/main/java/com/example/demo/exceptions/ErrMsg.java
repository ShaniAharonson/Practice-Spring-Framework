package com.example.demo.exceptions;

import lombok.Getter;

@Getter
public enum ErrMsg {
    ID_NOT_FOUND("id not found"),
    ID_ALREADY_EXISTS("Id already exists"),
    WEIGHT_MAST_BE_MORE_THAN_0("weight must be bigger than 0");
    private String msg;

    ErrMsg(String msg) {
        this.msg = msg;
    }
}
