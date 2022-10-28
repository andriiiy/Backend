package com.bosonit.ej63spring.model;

public class HumanObject {

    int ID;
    String name;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HumanObject(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HumanObject{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}