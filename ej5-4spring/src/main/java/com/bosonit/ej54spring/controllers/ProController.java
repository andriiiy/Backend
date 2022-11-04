package com.bosonit.ej54spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:pro.properties")
public class ProController {
    @Value("${environment3}") String value5;
    @Value("${bd.url3}") String value6;

    @GetMapping("/PRO")
    public String returnPRO(){
        return value5 + "\n-\n" + value6;
    }

}