package com.example.smart_city;

import java.lang.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootConfiguration
public class SmartCityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartCityApplication.class, args);
        System.out.println("🚀 Authentication Service is Running...");
    }
}
