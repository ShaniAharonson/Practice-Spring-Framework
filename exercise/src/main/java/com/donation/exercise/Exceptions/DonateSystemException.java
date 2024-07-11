package com.donation.exercise.Exceptions;

public class DonateSystemException extends Exception{
    public DonateSystemException(ErrMsg errmsg){
        super(errmsg.getMsg());
    }
}
