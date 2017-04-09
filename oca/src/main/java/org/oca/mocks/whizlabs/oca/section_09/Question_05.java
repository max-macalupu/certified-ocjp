package org.oca.mocks.whizlabs.oca.section_09;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_05 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");

//        String[] array = new String[6];
        String[] array = new String[3];
        array[0] = "a";
        array[1] = "b";
        array[2] = "c";
//        array[3] = "d";
//        array[4] = "e";
//        array[5] = "f";

        String [] array2 = stringList.toArray(array);
        for(String data: array2){
            System.out.println(data);
        }
    }
}
