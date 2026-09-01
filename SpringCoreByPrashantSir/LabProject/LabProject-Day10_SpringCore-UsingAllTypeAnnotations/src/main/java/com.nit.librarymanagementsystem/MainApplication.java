package com.nit.librarymanagementsystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        LibraryService libraryService =
                context.getBean(LibraryService.class);

        libraryService.issueBook();

        context.close();
    }
}
