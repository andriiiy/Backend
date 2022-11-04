package com.bosonit;

import com.bosonit.streams.exception.InvalidAgeException;
import com.bosonit.streams.exception.ProcessFileException;
import com.bosonit.streams.model.FileProcessor;
import com.bosonit.streams.model.Person;
import com.bosonit.streams.exception.ExceptionHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

public class Main {

    private static ExceptionHandler exceptionHandler = new ExceptionHandler();

    public static void main(String[] args) throws IOException, InvalidAgeException, ProcessFileException {

        FileProcessor fileProcessor = new FileProcessor();
        List<Person> personList;

        // Pasar argumentos (ruta del archivo ejercicio1.txt) desde configuración
        Path path = Paths.get(args[0]);

        try {
            System.out.println(">> Apartado a) | Menores de 25 años:");
            personList = fileProcessor.processFile(path, person -> person.getAge() < 25 && person.getAge() != 0  && !person.getName().isBlank());
            personList.forEach(System.out::println);
            System.out.println("--------------------------------------------");

            System.out.println(">> Apartado b) | Personas nombre no empiece con A:");
            personList = fileProcessor.processFile(path, person -> !person.getName().startsWith("A"));
            personList.forEach(System.out::println);
            System.out.println("--------------------------------------------");

            System.out.println(">> Apartado c) | Menores 25 años y primer elemento con ciudad Madrid:");
            personList = fileProcessor.processFile(path, person -> person.getAge() < 25 && person.getAge() != 0 && person.getCity().equalsIgnoreCase("Madrid") && !person.getName().isBlank());
            Optional<Person> personOptionalMadrid = personList.stream().findFirst();
            if (personOptionalMadrid.isPresent()) {
                System.out.println(personOptionalMadrid.get());
            } else {
                System.out.println("No value.");
            }
            System.out.println("--------------------------------------------");

            System.out.println(">> Apartado d) | Menores 25 años y primer elemento con ciudad Barcelona:");
            personList = fileProcessor.processFile(path, person -> person.getAge() < 25 && person.getAge() != 0 && person.getCity().equalsIgnoreCase("Barcelona") && !person.getName().isBlank());
            Optional<Person> personOptionalBarcelona = personList.stream().findFirst();
            if (personOptionalBarcelona.isPresent()) {
                System.out.println(personOptionalBarcelona.get());
            } else {
                System.out.println("No value.");
            }
            System.out.println("--------------------------------------------");
            System.out.println("Líneas incorrectas (formato no válido):");
            personList = fileProcessor.processFile(path, person -> person.getName().isBlank() || person.getCity()==null);
            personList.forEach(System.out::println);
            System.out.println("--------------------------------------------");

        } catch (Exception e) {
            System.out.println("The file cannot be accessed: "); //Cambiar texto
            exceptionHandler.printExceptionInfoAndStackTrace(e);
    }

    }

}