package com.bosonit.ej62springBoot.models;

public class PersonaModel {
    
    private String name;
    private String city;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonaModel(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }

    public PersonaModel() {

    }

    @Override
    public String toString() {
        return "PersonaModel{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

}
