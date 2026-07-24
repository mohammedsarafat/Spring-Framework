package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.nit.entity.Book;
import com.nit.service.BookService;


@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService service;

    // Save Book
    @PostMapping("/add")
    public Book saveBook(@RequestBody Book book) {
        return service.saveBook(book);
    }

    // Get All Books
    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    // Get Book By Id
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id) {
        return service.getBookById(id);
    }

    // Update Book
    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable Integer id,
                           @RequestBody Book book) {
        return service.updateBook(id, book);
    }

    // Delete Book
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Integer id) {
        service.deleteBook(id);
        return "Book Deleted Successfully";
    }

    // Search By Name
    @GetMapping("/name/{name}")
    public List<Book> getBookByName(@PathVariable String name) {
        return service.getBookByName(name);
    }

    // Search By Author
    @GetMapping("/author/{author}")
    public List<Book> getBookByAuthor(@PathVariable String author) {
        return service.getBookByAuthor(author);
    }

    // Sorting
    @GetMapping("/sort/{field}")
    public List<Book> sortBooks(@PathVariable String field) {
        return service.getAllBooksBySort(field);
    }

    // Pagination
    @GetMapping("/page")
    public Page<Book> getBooksByPage(@RequestParam int page,
                                     @RequestParam int size) {
        return service.getBooksByPage(page, size);
    }

    // Pagination + Sorting
    @GetMapping("/pageSort")
    public Page<Book> getBooksByPageAndSort(@RequestParam int page,
                                            @RequestParam int size,
                                            @RequestParam String field) {
        return service.getBooksByPageAndSort(page, size, field);
    }
    
     // Pagination + Price
    @GetMapping("/price/{price}")
    public List<Book> getBookByPrice(@PathVariable Double price) {
        return service.getBookByPrice(price);
    }

}
