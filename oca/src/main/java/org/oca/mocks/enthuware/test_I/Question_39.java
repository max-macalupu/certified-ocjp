package org.oca.mocks.enthuware.test_I;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_39 {
    public static void main(String[] args) {
        process();
    }
    private static void process(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("zzzz");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
