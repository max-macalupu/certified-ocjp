package org.oca.mocks.enthuware.test_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 2/5/2017.
 */
public class Question_05 {
    public static void main(String[] args) {
        processThisInterestingFunction();
    }

    private static void processThisInterestingFunction(){
        List<Book_Q05> book_q05List = Arrays.asList(new Book_Q05("tittle1", "M"),
                                                    new Book_Q05("Tittle2", "F"),
                                                    new Book_Q05("Tittle3", "M")
                );

        List<String> genreBookList = new ArrayList<>();

        book_q05List.stream().map(Book_Q05::getGenre).forEach(genreBookList::add);
        System.out.println(genreBookList);
        genreBookList.clear();

        book_q05List.stream().map(x -> x.getGenre()).forEach(genreBookList::add);
        System.out.println(genreBookList);
        genreBookList.clear();

        genreBookList = book_q05List.stream().map(Book_Q05::getGenre).collect(Collectors.toList());
        System.out.println(genreBookList);
        genreBookList.clear();

//        book_q05List.stream().flatMap(b -> b.getGenre()).forEach(g -> genreBookList.add(g));
    }
}

class Book_Q05{
    private String tittle;
    private String genre;

    public Book_Q05(String tittle, String genre) {
        this.tittle = tittle;
        this.genre = genre;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
