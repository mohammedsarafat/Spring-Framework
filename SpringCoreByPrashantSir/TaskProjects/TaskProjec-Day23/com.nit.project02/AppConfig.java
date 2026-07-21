package com.nit.project02;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit.project02")
@PropertySource("classpath:com/nit/project02/application2.properties")
public class AppConfig {

}

