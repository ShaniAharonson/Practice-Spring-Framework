package com.test.practiceBackend.Exceptions;

import lombok.Getter;

@Getter
public enum StudentErrMsg {
    ID_NOT_FOUND("id not found"),
    ID_ALREADY_EXISTS("id already exists"),
    DATE_ERROR("Date not found"),
    GRADES_ERROR("gardes must be up to 100"),
    GRADE_NOT_FOUND("Grade not found");

    private String msg;

    StudentErrMsg(String msg) {
        this.msg = msg;
    }
}
