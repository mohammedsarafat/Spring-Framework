package com.nit.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nit.entity.Book;

public interface BookService {

    // Save Book
    Book saveBook(Book book);

    // Get All Books
    List<Book> getAllBooks();

    // Get Book By Id
    Book getBookById(Integer id);

    // Update Book
    Book updateBook(Integer id, Book book);

    // Delete Book
    void deleteBook(Integer id);

    // Sorting
    List<Book> getAllBooksBySort(String field);

    // Pagination
    Page<Book> getBooksByPage(int page, int size);

    // Pagination + Sorting
    Page<Book> getBooksByPageAndSort(int page, int size, String field);

    // Search By Name
    List<Book> getBookByName(String name);

    // Search By Author
    List<Book> getBookByAuthor(String author);
    
    // Search By Price
    List<Book> getBookByPrice(Double price);

}
