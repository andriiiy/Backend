package com.bosonit.ej63spring.services;

import com.bosonit.ej63spring.model.HelloWorldObject;
import com.bosonit.ej63spring.model.HumanObject;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IservicesImplementation implements Iservices {


    public HelloWorldObject createObject(int id, String content) {
        HelloWorldObject helloWorld = new HelloWorldObject(id, content);
        return helloWorld;
    }

    @Override
    public HumanObject createHuman(int ID, String name) {
        HumanObject humOb = new HumanObject(ID, name);
        return humOb;
    }
}
