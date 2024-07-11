package com.Aharonson.Shani.aop;

import com.Aharonson.Shani.Service.TimeService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Autowired
    TimeService timeService;
    @After("@annotation(sendTime)")
    public void sendTheTime(){
       TimeService.sendTime();
    }
}
