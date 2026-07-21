package com.nit.project01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nit.project01")
@PropertySource("classpath:com/nit/project01/application1.properties")
public class AppConfig {

}

