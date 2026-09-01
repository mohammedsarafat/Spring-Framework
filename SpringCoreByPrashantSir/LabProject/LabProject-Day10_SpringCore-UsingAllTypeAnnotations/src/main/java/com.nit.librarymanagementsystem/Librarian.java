package com.nit.librarymanagementsystem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Librarian {

    private int librarianId;
    private String librarianName;

    public void displayLibrarian() {

        System.out.println("Librarian Details");
        System.out.println("Librarian Id : " + librarianId);
        System.out.println("Librarian Name : " + librarianName);
    }
}
