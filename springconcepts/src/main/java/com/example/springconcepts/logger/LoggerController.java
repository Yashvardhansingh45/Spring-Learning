package com.example.springconcepts.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoggerController{

    private static final Logger logger = LoggerFactory.getLogger(LoggerController.class);

    @GetMapping("/hello")
    public String hello() {
        logger.info("Hello endpoint was called.");
        logger.debug("Debug level log example.");
        logger.warn("Warning message example.");
        logger.error("Error message example.");

        return "Hello, Logging!";
    }
}
