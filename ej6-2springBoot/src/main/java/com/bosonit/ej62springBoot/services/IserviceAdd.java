package com.bosonit.ej62springBoot.services;

import com.bosonit.ej62springBoot.models.PersonaModel;
import org.springframework.stereotype.Service;

@Service
public interface IserviceAdd {

    PersonaModel addPeople(String nombre, String poblacion, int edad);

    PersonaModel getObject();
}
