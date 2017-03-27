package org.oca.mocks.whizlabs.practice_test_one;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_41 {
    public static void main(String[] args) {
//        GrandChild_Q41 grandChildQ41 = (int x) -> { x++;};
//        grandChildQ41.parentMethod(4);
    }
}

interface GrandParent_Q41{
    default void grandMethod(){}
}

interface Parent_Q41 extends  GrandParent_Q41{
    static void parentMethod(){}
}

interface Me_Q41 extends  Parent_Q41{
    void Method();
    void grandMetod();
}

interface Child_Q41 extends Me_Q41{
    void childMethod();
}

//@FunctionalInterface
interface GrandChild_Q41 extends  Child_Q41{
    default void grandMethod(){}
    default void parentMethod(int x){}
    default void Method(){}
}