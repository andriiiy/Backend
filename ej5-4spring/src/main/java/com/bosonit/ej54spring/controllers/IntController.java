package com.bosonit.ej54spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:int.properties")
public class IntController {

    @Value("${environment1}") String value1;
    @Value("${bd.url1}") String value2;

    @GetMapping("/INT")
    public String returnINT(){
        return value1 + "\n-\n" + value2;
    }

}