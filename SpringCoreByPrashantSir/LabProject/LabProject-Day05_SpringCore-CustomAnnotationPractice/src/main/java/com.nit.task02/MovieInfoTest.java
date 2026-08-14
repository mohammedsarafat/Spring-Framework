package com.nit.task02;

public class MovieInfoTest {

    public static void main(String[] args) {

        Class<Movie> clazz = Movie.class;

        MovieInfo info = clazz.getAnnotation(MovieInfo.class);

        System.out.println("Movie Name :" + info.movieName());
        System.out.println("Director :" + info.director());
        System.out.println("Release Year :" + info.releaseYear());
    }
}
