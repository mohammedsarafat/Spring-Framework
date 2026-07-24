package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nit.entity.Book;
import com.nit.repository.BookRepository;



@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository repository;

    // Save Book
    @Override
    public Book saveBook(Book book) {
        return repository.save(book);
    }

    // Get All Books
    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    // Get Book By Id
    @Override
    public Book getBookById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    // Update Book
    @Override
    public Book updateBook(Integer id, Book book) {

        Book existingBook = repository.findById(id).orElse(null);

        if (existingBook != null) {
            existingBook.setName(book.getName());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setPrice(book.getPrice());

            return repository.save(existingBook);
        }

        return null;
    }

    // Delete Book
    @Override
    public void deleteBook(Integer id) {
        repository.deleteById(id);
    }

    // Sorting
    @Override
    public List<Book> getAllBooksBySort(String field) {
        return repository.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    // Pagination
    @Override
    public Page<Book> getBooksByPage(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    // Pagination + Sorting
    @Override
    public Page<Book> getBooksByPageAndSort(int page, int size, String field) {
        return repository.findAll(
                PageRequest.of(page, size, Sort.by(Sort.Direction.ASC, field))
        );
    }

    // Search By Name
    @Override
    public List<Book> getBookByName(String name) {
        return repository.findByName(name);
    }

    // Search By Author
    @Override
    public List<Book> getBookByAuthor(String author) {
        return repository.findByAuthor(author);
    }

    @Override
    public List<Book> getBookByPrice(Double price) {
        return repository.findByPrice(price);
    }

	
}
