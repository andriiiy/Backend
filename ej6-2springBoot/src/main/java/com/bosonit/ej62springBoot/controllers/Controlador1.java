package com.bosonit.ej62springBoot.controllers;

import com.bosonit.ej62springBoot.models.CityModel;
import com.bosonit.ej62springBoot.models.PersonaModel;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value="/controlador1")
public class Controlador1 {

    PersonaModel addPeople;
    List<CityModel> cityData = new ArrayList<>();

    @GetMapping("/addPersona")
    public PersonaModel addPeople(@RequestHeader Map<String, String> header){
        addPeople = service.addPeople(header.get("name"), header.get("city"), Integer.parseInt(header.get("age")));
        return addPeople;
    }
    public PersonaModel returnPeople(){
        return addPeople;
    }

    @PostMapping("/addCiudad")
    public String addCity(@RequestBody CityModel city){
        cityData.add(city);
        return "Ciudad añadida";
    }
    public List<CityModel> returnCity(){
        return cityData;
    }

    @GetMapping("/bean/{bean1}")
    @Qualifier("bean1")
    public PersonaModel getBean(){
        return executable.bean1();
    }
    /*
    @GetMapping("/bean/{bean2}")
    @Qualifier("bean2")
    public PersonaModel getBean1(@PathVariable("bean2")String bean){
        return executable.bean2();
    }
    @GetMapping("/bean/{bean3}")
    @Qualifier("bean3")
    public PersonaModel getBean2(@PathVariable("bean3")String bean){
        return executable.bean3();
    }*/


}
