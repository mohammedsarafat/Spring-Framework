package com.nit.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {

    @Autowired
    private Book book;

    public void issueBook() {

        System.out.println("Library Processing Request");

        book.bookInfo();
    }
}
