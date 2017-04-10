package org.oca.mocks.whizlabs.test_III;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 10/4/2017.
 */
public class Question_09 {
    public static void main(String[] args) {
        process_this_interesting_method();
    }

    private static void process_this_interesting_method(){
//        getDataWithList().stream().findFirst().filter(x -> x!=null).
    }

    private static List<Data_Q09> getDataWithList(){
        return Arrays.asList(new Data_Q09(1), new Data_Q09(2), new Data_Q09(4), new Data_Q09(11));
    }
}

class Data_Q09{
    private int code;

    public Data_Q09(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}