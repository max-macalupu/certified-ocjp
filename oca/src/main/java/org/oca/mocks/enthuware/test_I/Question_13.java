package org.oca.mocks.enthuware.test_I;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_13 {
    public static void main(String[] args) {
        processThisAwesomeFunction();
    }

    private static void processThisAwesomeFunction(){
        List<Book_Q13> books = Arrays.asList(new Book_Q13("tittle", 2.2, "M", "MX", 1));
        Map<String, Map<String, List<Book_Q13>>> map = books.stream().collect(Collectors.groupingBy(Book_Q13::getAuthor, Collectors.groupingBy(Book_Q13::getGenre)));
        Map<String, List<String>> map2 = books.stream().collect(Collectors.groupingBy(Book_Q13::getAuthor, Collectors.mapping(Book_Q13::getGenre, Collectors.toList())));
        System.out.println(map);
        System.out.println(map2);
    }
}


class Book_Q13{
    private String tittle;
    private double price;
    private String genre;
    private String author;
    private int id;

    public Book_Q13(String tittle, double price, String genre, String author, int id) {
        this.tittle = tittle;
        this.price = price;
        this.genre = genre;
        this.author = author;
        this.id = id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book_Q13{" +
                "tittle='" + tittle + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", author='" + author + '\'' +
                ", id=" + id +
                '}';
    }
}