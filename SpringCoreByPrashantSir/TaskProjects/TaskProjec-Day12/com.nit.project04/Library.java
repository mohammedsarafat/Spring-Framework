package com.nit.project04;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Library {

    private List<String> issuedBooks;
    private Set<String> memberEmails;
    private Map<String, Integer> bookCopies;

    public Library() {
    }

    public Library(List<String> issuedBooks,
                   Set<String> memberEmails,
                   Map<String, Integer> bookCopies) {

        this.issuedBooks = issuedBooks;
        this.memberEmails = memberEmails;
        this.bookCopies = bookCopies;
    }

    public List<String> getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(List<String> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    public Set<String> getMemberEmails() {
        return memberEmails;
    }

    public void setMemberEmails(Set<String> memberEmails) {
        this.memberEmails = memberEmails;
    }

    public Map<String, Integer> getBookCopies() {
        return bookCopies;
    }

    public void setBookCopies(Map<String, Integer> bookCopies) {
        this.bookCopies = bookCopies;
    }

    @Override
    public String toString() {
        return "Library [issuedBooks=" + issuedBooks +
               ", memberEmails=" + memberEmails +
               ", bookCopies=" + bookCopies + "]";
    }
}