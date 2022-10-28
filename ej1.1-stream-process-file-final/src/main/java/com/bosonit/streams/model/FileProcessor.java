package com.bosonit.streams.model;

import com.bosonit.streams.exception.CSVException;
import com.bosonit.streams.exception.InvalidAgeException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FileProcessor {
    private AtomicInteger linea = new AtomicInteger(0);
    private int lineaInt;

    public List<Person> processFile(Path filePath, Predicate<Person> filter) throws CSVException {

        List<Person> personList = new ArrayList<>();
        List<Person> lista = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath)) {
            String line = bufferedReader.readLine();

            while (line != null) {
                try {
                    Person person = convertLineToPerson(line);
                    personList.add(person);
                    lista = personList.stream().filter(filter)
                    .collect(Collectors.toList());
                } catch (InvalidAgeException e) {
                    System.out.println("Error linea " + line);
                    e.printStackTrace();
                }

                line = bufferedReader.readLine();
            }
        }
        catch (IOException e) {
            throw new CSVException("Failed to read file.", e);
        }

        return lista;
    }

    private void assertEquals(String expected_value, String read) {
    }

    private Person convertLineToPerson(String line) throws InvalidAgeException {

        String[] partes = line.split(":");
        Person person = new Person();

        String name = getRequiredField(partes, 0, "Name");

        try {
            if (partes.length != 0) {
                person.setName(partes[0]);
            }
        } catch (Exception e) {
            System.out.println("Nombre vacío");
        }

        if (partes.length >= 2) {
            person.setCity(partes[1]);
            try {
                if (partes.length == 3) {
                    person.setAge(Integer.parseInt(partes[2]));
                }
            } catch  (Exception e) {
                throw new InvalidAgeException("Wrong age", e.getCause());
            }
        }

        return person;
    }

    private String getRequiredField(String[] partes, int i, String name) {
        return name;
    }

}