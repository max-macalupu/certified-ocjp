package org.oca.mocks.whizlabs.test_II;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_45 {
    public static void main(String[] args) {
        process_another_interesting_function();
    }

    private static void process_another_interesting_function(){
        List<Studen_Q45> studenQ45List = Arrays.asList(new Studen_Q45(1, "mx"),
                                                        new Studen_Q45(2, "lo"),
                                                        new Studen_Q45(3, "jr"));
        studenQ45List.replaceAll(getUnaryOperationFunction());
        System.out.println(studenQ45List);
    }

    private static UnaryOperator<Studen_Q45> getUnaryOperationFunction(){
        UnaryOperator<Studen_Q45> unaryOperator = (x) -> new Studen_Q45(x.getId(), x.getName().toUpperCase());
        return  unaryOperator;
    }
}

class Studen_Q45{
    private int id;
    private String name;

    public Studen_Q45(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}