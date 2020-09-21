package com.spring.logback.RollingFileAppenderDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class RollingFileAppenderDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RollingFileAppenderDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        for (int i = 0; i < 100; i++)
            LOGGER.error("Test logging...");
    }

}
