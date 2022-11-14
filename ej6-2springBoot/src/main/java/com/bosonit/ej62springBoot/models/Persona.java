package com.bosonit.ej62springBoot.models;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Persona {

    @Bean("bean1")
    @Primary
    public PersonaModel bean1() {
        PersonaModel bean1 = new PersonaModel("bean1", "city1", 20);
        return bean1;
    }

    @Bean("bean2")
    public PersonaModel bean2() {
        PersonaModel bean2 = new PersonaModel("bean2", "city2", 25);
        return bean2;
    }

    @Bean("bean3")
    public PersonaModel bean3() {
        PersonaModel bean3 = new PersonaModel("bean3", "city3", 28);
        return bean3;
    }

}
