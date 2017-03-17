package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_25 {

    public static void main(String[] args) {
        List<Movie> movieList = Arrays.asList(
                new Movie("Terminator", Movie.Genre.FICTION),
                new Movie("Los tres chiflados", Movie.Genre.COMEDIA),
                new Movie("Barco fantasma", Movie.Genre.TERROR)
        );

        movieList.stream().collect(Collectors.groupingBy(Movie::getGenre)).forEach((x,y) -> System.out.println(x + " " + y));
        Set<Movie.Genre> genres = movieList.stream().collect(Collectors.mapping(Movie::getGenre, Collectors.toSet()));
        System.out.println(genres);
    }
}

class Movie{
    private String name;
    private Genre genre;

    public Movie(String name, Genre genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", genre=" + genre +
                '}';
    }

    enum Genre{
        FICTION, TERROR, COMEDIA
    }
}