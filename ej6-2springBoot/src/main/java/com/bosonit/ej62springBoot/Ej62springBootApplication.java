package com.bosonit.ej62springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ej62springBootApplication {

	@Autowired
	public static ConfigurableApplicationContext ex;
	public static void main(String[] args) {
		ex=SpringApplication.run(Ej62springBootApplication.class, args);
	}

}
