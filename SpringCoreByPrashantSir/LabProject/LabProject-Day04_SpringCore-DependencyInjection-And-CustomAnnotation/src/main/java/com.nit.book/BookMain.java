package com.nit.book;

public class BookMain {
    public static void main(String[] args) {
        Class<Book> obj = Book.class;
        BookInfo bookInfo = obj.getAnnotation(BookInfo.class);
        
        System.out.println("Title  :" + bookInfo.title());
        System.out.println("Author :" + bookInfo.author().replace("Rowling.", "Rowling"));
        System.out.printf("Price  :%.2f\n", bookInfo.price());
    }
}
