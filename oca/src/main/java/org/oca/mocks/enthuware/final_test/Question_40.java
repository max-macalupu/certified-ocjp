package org.oca.mocks.enthuware.final_test;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_40 {
    public static void main(String[] args) {
        Book_Q40 book_q40 = new Book_Q40("Titlte1", 10.5);
        Book_Q40 book_q402 = new Book_Q40("Titlte2", 14.5);
        Supplier supplier = book_q40::getPrice;
        System.out.println(supplier.get());
        Supplier supplier1 = book_q402::getPrice;
        System.out.println(supplier1.get());
    }
}

class Book_Q40{

    private String tittle;
    private Double price;

    public Book_Q40(String tittle, Double price) {
        this.tittle = tittle;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}