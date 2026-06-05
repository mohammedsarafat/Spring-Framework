package com.nit.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nit")
public class AppConfig {

    @Bean
    public LocalDateTime currentDateTime() {
        return LocalDateTime.now();
    }
}
