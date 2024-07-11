package com.test.practiceBackend.Exceptions;

public class LecturerSystemException extends Exception{
    public LecturerSystemException(LecturerErrMsg lecturerErrMsg){
        super(lecturerErrMsg.getMgs());
    }
}
