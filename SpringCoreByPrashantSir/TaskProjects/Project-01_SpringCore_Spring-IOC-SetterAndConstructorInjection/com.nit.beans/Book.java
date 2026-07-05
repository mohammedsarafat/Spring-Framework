package com.nit.beans;

public class Book
{
    private String title;
    private int price;
    private int pages;

    public Book()
    {
        System.out.println("Book Object Created...");
    }

    public void setTitle(String title)
    {
        System.out.println("Book title setter called");
        this.title = title;
    }

    public void setPrice(int price)
    {
        System.out.println("Book price setter called");
        this.price = price;
    }

    public void setPages(int pages)
    {
        System.out.println("Book pages setter called");
        this.pages = pages;
    }

    @Override
    public String toString()
    {
        return "Book [title=" + title +
               ", price=" + price +
               ", pages=" + pages + "]";
    }
}
