package com.exam.exam.Exceptions;

public class SchoolSystemException extends Exception{
    public SchoolSystemException(ErrMsg errMsg){
        super(errMsg.getMsg());
    }
}
