package com.bosonit.ej62springBoot.services;

import com.bosonit.ej62springBoot.models.PersonaModel;
import org.springframework.stereotype.Service;

@Service
public interface IserviceGet {
    public PersonaModel getObject();
}
