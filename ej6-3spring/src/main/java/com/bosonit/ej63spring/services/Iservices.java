package com.bosonit.ej63spring.services;

import com.bosonit.ej63spring.model.HelloWorldObject;
import com.bosonit.ej63spring.model.HumanObject;

public interface Iservices {

    public HelloWorldObject createObject(int id, String content);

    public HumanObject createHuman (int ID, String name);
}
