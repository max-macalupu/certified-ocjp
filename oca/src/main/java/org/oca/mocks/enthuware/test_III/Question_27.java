package org.oca.mocks.enthuware.test_III;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_27 {
    public static void main(String[] args) {
        process();
    }

    private static void process(){
    }
}

interface accout_Q27{
    public default String getId(){
        return "1";
    }
}

interface PremiunAccount extends accout_Q27{
//    String getId();
    default String getId(){
        return "2";
    }
}