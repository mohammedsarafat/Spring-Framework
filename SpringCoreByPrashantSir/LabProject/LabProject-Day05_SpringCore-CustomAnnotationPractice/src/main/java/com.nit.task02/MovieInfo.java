package com.nit.task02;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MovieInfo {

    String movieName();

    String director();

    int releaseYear();
}
