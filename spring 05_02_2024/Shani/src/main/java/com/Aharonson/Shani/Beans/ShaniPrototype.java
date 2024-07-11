package com.Aharonson.Shani.Beans;

import lombok.Data;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Data
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ShaniPrototype {

}
