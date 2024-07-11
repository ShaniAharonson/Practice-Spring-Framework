package com.Aharonson.Shani.Service;

import org.springframework.stereotype.Service;

@Service
public class TimeService {
    public static void sendTime(){
        System.out.println("The current time is: "+ System.currentTimeMillis());
    }
}
