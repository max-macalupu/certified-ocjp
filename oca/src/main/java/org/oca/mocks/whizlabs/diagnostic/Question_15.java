package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 17/3/2017.
 */
public class Question_15 {

    public static void main(String[] args) {
        List<Novel> novelList = Arrays.asList(
            new Novel("Novel 1", 11),
            new Novel("Novel 2", 14)
        );
        System.out.println(novelList.stream().collect(Collectors.averagingDouble(Novel::getPrice)));
    }
}

class Novel{
    private String tittle;
    private int price;

    public Novel(String tittle, int price) {
        this.tittle = tittle;
        this.price = price;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}