package com.bosonit.ej52spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:application.yml")
@Component
public class Controller {

    @Value("${greeting}")
    private String message1;

    @Value("${my.number}")
    private String message2;
    @Value("${new.property:new.property no tiene valor}")
    private String message3;

    @Bean("firstMessage")
    public String getMessage1(){
        return message1;
    }

    @Bean("secondMessage")
    public String getMessage2(){
        return message2;
    }

    @Bean("thirdMessage")
    public String getMessage3(){
        return "El valor de new.Property es: " + message3;
    }

}
