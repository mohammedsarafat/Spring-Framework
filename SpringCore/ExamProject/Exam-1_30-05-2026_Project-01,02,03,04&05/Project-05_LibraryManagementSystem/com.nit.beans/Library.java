package com.nit.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {

    private int libraryId;
    private String libraryName;
    private String address;

    private Librarian librarian;

    private List<String> books;
    private Set<String> categories;
    private Map<String, Integer> categoryCount;

    public Library() {
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public List<String> getBooks() {
        return books;
    }

    public void setBooks(List<String> books) {
        this.books = books;
    }

    public Set<String> getCategories() {
        return categories;
    }

    public void setCategories(Set<String> categories) {
        this.categories = categories;
    }

    public Map<String, Integer> getCategoryCount() {
        return categoryCount;
    }

    public void setCategoryCount(Map<String, Integer> categoryCount) {
        this.categoryCount = categoryCount;
    }

    public void displayLibraryDetails() {

        System.out.println("Library Id      : " + libraryId);
        System.out.println("Library Name    : " + libraryName);
        System.out.println("Address         : " + address);

        System.out.println("\n===== Librarian Details =====");
        System.out.println("Librarian Id    : " + librarian.getLibrarianId());
        System.out.println("Librarian Name  : " + librarian.getLibrarianName());
        System.out.println("Experience      : " + librarian.getExperience());

        System.out.println("\n===== Books =====");
        books.forEach(System.out::println);

        System.out.println("\n===== Categories =====");
        categories.forEach(System.out::println);

        System.out.println("\n===== Category Wise Book Count =====");
        categoryCount.forEach((key, value) ->
                System.out.println(key + " : " + value));
    }
}
