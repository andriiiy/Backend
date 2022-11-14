package com.bosonit.ej62springBoot.controllers;

import com.bosonit.ej62springBoot.models.CityModel;
import com.bosonit.ej62springBoot.models.PersonaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/controlador2")
public class Controlador2 {

    @Autowired
    Controlador1 executable;

    @GetMapping(value="/getPersona")
    public PersonaModel getAge() {
        return executable.returnPeople();
    }

    @GetMapping("/getCiudad")
    public List<CityModel> getCity(){
        return executable.returnCity();
    }

}