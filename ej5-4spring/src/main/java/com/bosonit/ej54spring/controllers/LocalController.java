package com.bosonit.ej54spring.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:local.properties")
public class LocalController {

    @Value("${environment2}") String value3;
    @Value("${bd.url2}") String value4;

    @GetMapping("/local")
    public String returnLocal(){
        return value3 + "\n-\n" + value4;
    }


}