package com.example.demo.exceptions;

public class CatException extends Exception{
    public CatException(ErrMsg errMsg){
        super(errMsg.getMsg());
    }
}
