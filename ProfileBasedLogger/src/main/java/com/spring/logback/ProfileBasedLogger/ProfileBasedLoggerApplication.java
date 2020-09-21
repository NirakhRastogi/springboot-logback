package com.spring.logback.ProfileBasedLogger;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class ProfileBasedLoggerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ProfileBasedLoggerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 100; i++) {
            LOGGER.error("Logging error: Profile Based Logging");
            LOGGER.info("Logging info: Profile Based Logging");
        }
    }
}
