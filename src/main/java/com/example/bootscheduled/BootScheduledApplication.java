package com.example.bootscheduled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootScheduledApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootScheduledApplication.class, args);
    }

}
