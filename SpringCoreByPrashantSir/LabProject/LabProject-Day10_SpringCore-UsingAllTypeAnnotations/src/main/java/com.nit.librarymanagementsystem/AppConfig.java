package com.nit.librarymanagementsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Book book() {

        return new Book(
                101,
                "Spring Boot",
                "Rod Johnson"
        );
    }

    @Bean
    public Member member() {

        return new Member(
                1,
                "Rahul"
        );
    }

    @Bean
    public Librarian librarian() {

        return new Librarian(
                201,
                "Anil"
        );
    }

    @Bean
    public LibraryService libraryService() {

        return new LibraryService();
    }
}
