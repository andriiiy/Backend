package com.bosonit.ej52spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@PropertySource("classpath:application.yml")  // A pesar de indicar esta anotación, Spring da prioridad al application.properties y lee los valores de ahí
@Component
public class Controller {

    @Value("${greeting:greeting}")
    private String mensaje1;

    @Value("${my.number:my.number}")
    private String mensaje2;

    @Value("${new.property:new.property no tiene valor}")
    private String mensaje3;

//  Imprime que no tiene valor puesto que en application.properties no está la propiedad new.property2
//  @Value("${new.property2:new.property2 no tiene valor}")
//  private String mensaje3;

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