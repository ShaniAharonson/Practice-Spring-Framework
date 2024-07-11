package com.test.practiceBackend.Exceptions;

public class StudentSystemException extends Exception{
    public StudentSystemException(StudentErrMsg studentErrMsg){
        super(studentErrMsg.getMsg());
    }
}
