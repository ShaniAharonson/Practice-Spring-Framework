package com.cat.beckend.exception;

public class CatSystemException extends Exception{
    public CatSystemException(ErrMsg errMsg) {
        super(errMsg.getMsg());
    }
}
