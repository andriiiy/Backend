package com.bosonit.ej71springData.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Data
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String telefono;
    private int edad;
    private String poblacion;


}
