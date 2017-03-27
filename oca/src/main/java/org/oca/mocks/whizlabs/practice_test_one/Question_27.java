package org.oca.mocks.whizlabs.practice_test_one;

import org.oca.chapter06.tocollection.CollectorsToMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_27 {


    public static void main(String[] args) {

        List<Book_Q27> bookQ27List = Arrays.asList(
                new Book_Q27("tittle 01", "author 02", 10.0)      ,
                new Book_Q27("tittle 03", "author 03", 10.0)      ,
                new Book_Q27("tittle 04", "author 04", 20.0)      ,
                new Book_Q27("tittle 05", "author 05", 30.0)
        );
        bookQ27List.stream().filter(book -> book.getPrice() > 10).collect(Collectors.toMap(Book_Q27::getTittle, Book_Q27::getTittle)).forEach((a,b) -> System.out.print(b));
    }
}

class Book_Q27{

    private String tittle;
    private String author;
    private double price;

    public Book_Q27(String tittle, String author, double price) {
        this.tittle = tittle;
        this.author = author;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book_Q27{" +
                "tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
