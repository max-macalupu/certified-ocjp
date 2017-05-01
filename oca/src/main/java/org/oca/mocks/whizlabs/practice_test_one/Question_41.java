package org.oca.mocks.whizlabs.practice_test_one;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_41 {
    public static void main(String[] args) {
        GrandChild_Q41 grandChildQ41 = (x) -> {
            System.out.println(10 * x);
        };
        grandChildQ41.parentMethod();
        grandChildQ41.childMethod(4);
    }
}

//@FunctionalInterface
interface GrandParent_Q41{
    default void grandMethod(){}
}

//@FunctionalInterface
interface Parent_Q41 extends  GrandParent_Q41{
    static void parentMethod(){}
}

//@FunctionalInterface
interface Me_Q41 extends  Parent_Q41{
    void Method();
    void grandMethod();
}

//@FunctionalInterface
interface Child_Q41 extends Me_Q41{
    void childMethod(int x);
}

//@FunctionalInterface
interface GrandChild_Q41 extends  Child_Q41{
    default void grandMethod(){
        System.out.println("Default GrandMethod");
    }
    default void parentMethod(){
        System.out.println("Parent Method");
    }
    default void Method(){}
}