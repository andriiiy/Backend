package com.bosonit.ej52spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:application.yml")
@Component
public class Controller {

    @Value("${greeting:greeting}")
    private String mensaje1;

    @Value("${my.number:my.number}")
    private String mensaje2;

    @Value("${new.property:new.property no tiene valor}")
    private String mensaje3;

    @Bean("primerMensaje")
    public String getMensaje1(){
        return mensaje1;
    }

    @Bean("segundoMensaje")
    public String getMensaje2(){
        return mensaje2;
    }

    @Bean("tercerMensaje")
    public String getMensaje3(){
        return "El valor de new.Property es: " + mensaje3;
    }

}
