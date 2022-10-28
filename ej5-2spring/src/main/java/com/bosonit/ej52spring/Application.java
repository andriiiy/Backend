package com.bosonit.ej52spring;

import com.bosonit.ej52spring.controllers.Controller;
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
	@Qualifier("firstMessage")
	private String message1;

	@Autowired
	@Qualifier("secondMessage")
	private String message2;

	@Autowired
	@Qualifier("thirdMessage")
	private String message3;

	@Autowired
	private Controller addMessage;
	private static Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(message1);
		log.info(message2);
		log.info(message3);
	}
}