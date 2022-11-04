package com.bosonit.ej52spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	@Qualifier("primerMensaje")
	private String mensaje1;

	@Autowired
	@Qualifier("segundoMensaje")
	private String mensaje2;

	@Autowired
	@Qualifier("tercerMensaje")
	private String mensaje3;

	@Autowired
	private static Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(mensaje1);
		log.info(mensaje2);
		log.info(mensaje3);
	}
}