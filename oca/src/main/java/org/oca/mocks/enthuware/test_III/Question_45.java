package org.oca.mocks.enthuware.test_III;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_45 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<String>();
        names.add("111");names.add("111");
        names.add("222");names.add("333");
        for(String name: names){
            switch (name){
                default:
                    System.out.println("333");break;
                case "111":
                    System.out.println("111");
                case "222":
                    System.out.println("222");
            }
        }
    }
}
