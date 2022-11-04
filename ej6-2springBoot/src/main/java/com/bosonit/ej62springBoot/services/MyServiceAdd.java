package com.bosonit.ej62springBoot.services;

import com.bosonit.ej62springBoot.controllers.Controlador1;
import com.bosonit.ej62springBoot.models.PersonaModel;
import org.springframework.stereotype.Component;

@Component
public class MyServiceAdd implements IserviceAdd {

    @Override
    public PersonaModel addPeople(String name, String city, int age) {
        PersonaModel peopleObject = new PersonaModel();
        peopleObject.setName(name);
        peopleObject.setCity(city);
        peopleObject.setAge(age);
        return peopleObject;
    }


    //DOESN'T WORKS.
    public PersonaModel getObject() {
        Controlador1 executable = new Controlador1();
        PersonaModel peopleObject = executable.returnPeople();
        return peopleObject;
    }

}
