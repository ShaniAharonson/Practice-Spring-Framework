package com.Aharonson.Shani.config;

import com.Aharonson.Shani.Beans.Subject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Bean
@Scope("prototype")
public class myConfig {
    public Subject doSomething(){
        Subject subject = new Subject();
        subject.
    }

}
