package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(BrowserRepository repository) {
        return (args) -> {
            // save a Browser
            repository.save(new Browser("SaveTest", 11, 21.21D, 5));

            // fetch all customers
            log.info("Browser found with findAll():");
            log.info("-------------------------------");
            for (Browser browser : repository.findAll()) {
                log.info(browser.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            Browser browser = repository.findByName("Chrome");
            log.info("Browser found with findByName(\"Chrome\"):");
            log.info("--------------------------------");
            log.info(browser.toString());
            log.info("");

            log.info("");
        };
    }
}
