package org.oca.mocks.whizlabs.test_III;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mx on 10/4/2017.
 */
public class Question_10 {
    public static void main(String[] args) {
        process_this_fuck_method();
    }

    private static void process_this_fuck_method(){
        new Data_Q10(null);
    }
}

class Data_Q10{
    private List<Integer> integerList;

    public Data_Q10(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public List<Integer> getIntegerList() {
        return new ArrayList<>(integerList);
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = new ArrayList<>(integerList);
    }
}
