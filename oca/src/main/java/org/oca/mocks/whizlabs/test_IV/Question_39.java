package org.oca.mocks.whizlabs.test_IV;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_39 {
    public static void main(String[] args) {
        process();
    }

    private static void process(){
        Changer_Q39<String> stringChanger_q39 = String::toLowerCase;
        String str = stringChanger_q39.change("xxxXDDASA");
        System.out.println(str);
    }
}

interface Changer_Q39<T>{
    T change(T t);
}