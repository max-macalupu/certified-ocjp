package org.oca.mocks.enthuware.final_test;

import java.util.Comparator;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_50 {
    public static void main(String[] args) {
        Comparator<Book_Q50> comparator = (a, b) -> (""+a.getValue()).compareTo(""+b.getValue());
    }


}

class Book_Q50{
    int value;

    public Book_Q50(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
