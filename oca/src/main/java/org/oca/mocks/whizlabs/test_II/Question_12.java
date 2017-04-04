package org.oca.mocks.whizlabs.test_II;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

/**
 * Created by mx on 2/4/2017.
 */
public class Question_12 {
    public static void main(String[] args) {
        List<Movie_Q12> movieQ12List = Arrays.asList(
                new Movie_Q12("tittle01", 9.62),
                new Movie_Q12("tittle02", 5.32),
                new Movie_Q12("tittle03", 7.12),
                new Movie_Q12("tittle04", 2.32)
            );
        ToDoubleFunction<Movie_Q12> toDoubleFunction = Movie_Q12::getPrice;
        double average = movieQ12List.stream().mapToDouble(toDoubleFunction).average().orElse(0);
        System.out.println(average);

        /**invocating wrong option*/
        wrongOption(movieQ12List);
    }

    private static void wrongOption(List<Movie_Q12> movieQ12List){
        double average = movieQ12List.stream().mapToInt( m-> (int) m.getPrice()).average().orElse(0);
        System.out.println(average);
    }
}

class Movie_Q12{
    private String tittle;
    private double price;

    public Movie_Q12(String tittle, double price) {
        this.tittle = tittle;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}