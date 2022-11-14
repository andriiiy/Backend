package com.bosonit.ej62springBoot.services;

import com.bosonit.ej62springBoot.controllers.Controlador1;
import com.bosonit.ej62springBoot.models.PersonaModel;
import org.springframework.stereotype.Component;

@Component
public class MyServiceAdd implements IserviceAdd {

    @Override
    public PersonaModel addPeople(String nombre, String poblacion, int edad) {
        PersonaModel peopleObject = new PersonaModel();
        peopleObject.setNombre(nombre);
        peopleObject.setPoblacion(poblacion);
        peopleObject.setEdad(edad);
        return peopleObject;
    }


    //No funciona
    public PersonaModel getObject() {
        Controlador1 executable = new Controlador1();
        PersonaModel peopleObject = executable.returnPeople();
        return peopleObject;
    }

}
