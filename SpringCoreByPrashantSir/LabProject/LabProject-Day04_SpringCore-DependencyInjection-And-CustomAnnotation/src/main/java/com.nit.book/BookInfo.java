package com.nit.book;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface BookInfo {
    String title();
    String author();
    double price();
}
