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
    //http://localhost:8080/controlador2/getPersona
    @GetMapping(value="/getPersona")
    public PersonaModel getAge() {
        return executable.returnPeople();
    }
    //http://localhost:8080/controlador2/getCiudad
    @GetMapping("/getCiudad")
    public List<CityModel> getCity(){
        return executable.returnCity();
    }

}
