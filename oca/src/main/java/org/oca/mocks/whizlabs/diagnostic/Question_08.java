package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 17/3/2017.
 */
public class Question_08 {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("odisea", Book.Category.FICTION),
            new Book("spartaco", Book.Category.NO_FICTION)
        );
        books.stream().filter(book -> book.getCategory().equals(Book.Category.FICTION)).peek(book -> System.out.println(book.getTittle()));
    }
}

class Book{

    private String tittle;
    private Category category;

    public Book(String tittle, Category category) {
        this.tittle = tittle;
        this.category = category;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    static enum Category{
        FICTION, NO_FICTION
    }
}