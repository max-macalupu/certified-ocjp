package org.oca.mocks.enthuware.test_III;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by mx on 5/5/2017.
 */
public class Question_13 {

    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        Testclass_Q13.checkList(new ArrayList(), a -> a.isEmpty());
        Testclass_Q13.checkList(new ArrayList(), a -> a.add("Hello"));
        Testclass_Q13.checkList(new ArrayList(), (List a) -> a.add("Hello"));
    }
}

class Testclass_Q13{
    public static boolean checkList(List list, Predicate<List> p){
        return p.test(list);
    }
}