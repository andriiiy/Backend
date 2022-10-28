package com.bosonit.ej53spring.controllers;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {

    Logger logger = LoggerFactory.getLogger(LogController.class);

    @RequestMapping("/")
    public String index(){
        logger.trace("Mensaje a nivel TRACE");
        logger.debug("Mensaje a nivel DEBUG");
        logger.info("Mensaje a nivel INFO");
        logger.warn("Mensaje a nivel WARNING");
        logger.error("Mensaje a nivel ERROR");
        return "Ahora revisa los logs";
    }

    @GetMapping("/ERROR")
    public void getError(){
        log.error("Aquí muestra el error");
    }

    @GetMapping("/warning")
    public void getWarining(){
        log.warn("Aquí muestra el warning");
    }

}
