package com.bosonit.ej71springData.interfaces;

import com.bosonit.ej71springData.model.Persona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.beans.PersistenceDelegate;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
