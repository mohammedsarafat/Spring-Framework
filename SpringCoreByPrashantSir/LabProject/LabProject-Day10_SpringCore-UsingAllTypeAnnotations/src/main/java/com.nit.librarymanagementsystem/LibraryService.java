package com.nit.librarymanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LibraryService {

    private Book book;

    private Member member;

    private Librarian librarian;

    @Autowired
    public void setBook(Book book) {
        this.book = book;
    }

    @Autowired
    public void setMember(Member member) {
        this.member = member;
    }

    @Autowired
    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public void issueBook() {

        System.out.println("Library Service Started...");

        book.displayBook();

        member.displayMember();

        librarian.displayLibrarian();

        System.out.println("Book Issued Successfully.");
    }
}
