package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_53 {

    public static void main(String[] args) {
        List<Movie_53> moviesList = Arrays.asList(
                new Movie_53("movie 01",40),
                new Movie_53("movie 02",40),
                new Movie_53("movie 03",60),
                new Movie_53("movie 04",60)
        );
        double constant = 60;
        System.out.println(moviesList.stream().filter(x-> x.getPrice()>constant).mapToDouble(Movie_53::getPrice).average().orElse(50));
    }
}

class Movie_53{

    private String tittle;
    private double price;

    public Movie_53(String tittle, double price) {
        this.tittle = tittle;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }
}
