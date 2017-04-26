package org.oca.mocks.whizlabs.test_II;

import org.oca.chapter04.iterator.TreeSetTest;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_53 {
    public static void main(String[] args) {
        processTHisInterestingMethod();
    }

    private static void processTHisInterestingMethod(){
        Set<String> stringSet = new TreeSet();
        stringSet.add("Welcome");
        stringSet.add("to");
        stringSet.add("the");
        stringSet.add("World");

        for(String string: stringSet){
            switch (string){
                case "Welcome":
                    System.out.println("Welcome");break;
                case "to"   :
                    System.out.println("to");break;
                case "the":
                    System.out.println("the");break;
                case "World":
                    System.out.println("World");break;
            }
        }
    }
}