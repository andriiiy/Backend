package com.bosonit.ej61springBoot.models;

public class Usuario {

    public Usuario(String name, int edad, String ciudad) {
        this.name = name;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad+1;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    private String name;
    private int edad;
    private String ciudad;

}
