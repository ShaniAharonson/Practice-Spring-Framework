package com.test.practiceBackend.Exceptions;

import lombok.Getter;

@Getter
public enum LecturerErrMsg {
    ID_NOT_FOUND("id not found"),
    ID_ALREADY_EXISTS("id already exists");

    private String mgs;

    LecturerErrMsg(String mgs) {
        this.mgs = mgs;
    }
}
