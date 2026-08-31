package com.nit.librarymanagementsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private int bookId;
    private String bookName;
    private String author;

    public void displayBook() {

        System.out.println("Book Details");
        System.out.println("Book Id : " + bookId);
        System.out.println("Book Name : " + bookName);
        System.out.println("Author : " + author);
    }
}
