package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    // Search by Name
    List<Book> findByName(String name);

    // Search by Author
    List<Book> findByAuthor(String author);

    List<Book> findByPrice(Double price);
}
