package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.beans.Passport;
import com.nit.beans.Person;

@Configuration
//Tells Spring that this class contains Bean configurations

@ComponentScan("com.nit.beans")
//Scans all classes inside com.nit.beans package
//and creates Spring Beans automatically
public class AppConfig {

	@Bean
	public Passport getPassport() {

		Passport p = new Passport();

		p.setName("Sarafat");
		p.setNumber("IND784598");
		p.setCountry("India");

		return p;
	}

	@Bean
	public Person getPerson() {

		Person p = new Person();

		p.setP_name("Mohammed Sarafat");
		p.setP_age(21);
		p.setAdress("Odisha");
		p.setMob_num(7326962693L);

		// Inject Passport Object
		p.setP(getPassport());

		return p;
	}
}
