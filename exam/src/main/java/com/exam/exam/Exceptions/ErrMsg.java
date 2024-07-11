package com.exam.exam.Exceptions;

import lombok.Getter;

@Getter
public enum ErrMsg {
    ID_NOT_FOUND("id not found"),
    ID_ALREADY_EXISTS("id already exists"),
    STUDENT_NOT_FOUND("student not found");

    ErrMsg(String msg) {
        this.msg = msg;
    }

    private String msg;

}
