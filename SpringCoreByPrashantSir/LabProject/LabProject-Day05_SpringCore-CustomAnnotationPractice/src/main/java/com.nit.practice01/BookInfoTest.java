package com.nit.practice01;

public class BookInfoTest {

    public static void main(String[] args) {

        Class<Book> clazz = Book.class;

        BookInfo info = clazz.getAnnotation(BookInfo.class);

        System.out.println("Title  :" + info.title());
        System.out.println("Author :" + info.author());
        System.out.printf("Price  :%.2f%n", info.price());
    }
}
