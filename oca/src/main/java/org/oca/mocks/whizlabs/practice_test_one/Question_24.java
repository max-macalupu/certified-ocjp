package org.oca.mocks.whizlabs.practice_test_one;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_24 {
    public static void main(String[] args) {

        List<Character> listWithData =new ArrayList<>();
        for(char a='z'; a>='a'; a-- ){
            listWithData.add(a);
        }

        long amount = listWithData.stream().filter(a -> a.compareTo('c')>0).count();
        System.out.println(amount);
    }
}