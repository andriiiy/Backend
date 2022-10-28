package com.bosonit.ej63spring.controllers;

import com.bosonit.ej63spring.model.HelloWorldObject;
import com.bosonit.ej63spring.model.HumanObject;
import com.bosonit.ej63spring.services.Iservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/methods")
public class TotalController {

    List<HumanObject> humanList = new ArrayList<>();;
    List<HelloWorldObject> helloNotSimple = new ArrayList<>();

    @Autowired
    Iservices ex;

    @GetMapping("/greetings")
    public List<HelloWorldObject> getHelloWorld (){
        List<HelloWorldObject> helloSimple = new ArrayList<>();
        helloSimple.add(ex.createObject(helloSimple.size(), "Hello, World!"));
        return helloSimple;
    }

    @GetMapping("/greetings{name}")
    public List<HelloWorldObject> getHelloWorldWithName (@PathVariable("name") String name){
        helloNotSimple.add(ex.createObject(helloNotSimple.size(), "Hello, "+ name));
        return helloNotSimple;
    }

    @PostMapping("/addPeople")
    public List<HumanObject> addHuman (@RequestBody HumanObject human){
        humanList.add(ex.createHuman(humanList.size(), human.getName()));
        return humanList;
    }

    @GetMapping("/user{id}")
    public List<HumanObject> getHumansID (@PathVariable ("id") int id){
        List<HumanObject> filtredList = humanList.stream().filter((p)-> p.getID()==id).toList();
        return filtredList;
    }

    @PutMapping("/put")
    public HumanObject modifyHuman (@RequestParam String name, @RequestParam int ID){
        // List<HumanObject> filtresList = humanList.stream().filter((p)-> p.getID()==id).filter((p)-> p.getName().equals(name)).toList();
        return new HumanObject (ID, name);
    }
}