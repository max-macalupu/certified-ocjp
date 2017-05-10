package org.oca.mocks.enthuware.final_test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_19 {
    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        Name_Q19 name_q19 = new Name_Q19();
        List<String> stringList = Arrays.asList("Hola", "Que", "tal");
        name_q19.setStringList(stringList.stream().collect(Collectors.toList()));
//        name_q19.getStringList().stream().forEach(x -> x.);
    }
}

class Name_Q19{
    private List<String> stringList;

    public Name_Q19(List<String> stringList) {
        this.stringList = stringList;
    }

    public Name_Q19() {
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }
    public static void processName(){
//        System.out.println(getStringList());
    }
}