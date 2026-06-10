package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.beans.Passport;
import com.nit.beans.Person;

@Configuration
@ComponentScan(basePackages = "com.nit.beans")
public class AppConfig {

    @Bean
    public Passport getPassport() {
        return new Passport("Sarafat", "IND56", "INDIA");
    }

    @Bean
    public Person getPerson() {
        return new Person("Sarafat", 23, 4258963257L, getPassport());
    }
}
