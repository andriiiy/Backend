package com.bosonit.ej62springBoot.controllers;

import com.bosonit.ej62springBoot.Ej62springBootApplication;
import com.bosonit.ej62springBoot.models.PersonaModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controlador")
public class ObjectController {

    @GetMapping("/bean/{bean1}")
    public PersonaModel getBean(@PathVariable("bean1") String bean){
        return (PersonaModel) Ej62springBootApplication.ex.getBean(bean);
    }

}
