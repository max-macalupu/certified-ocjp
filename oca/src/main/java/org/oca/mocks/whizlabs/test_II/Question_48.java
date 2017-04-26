package org.oca.mocks.whizlabs.test_II;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_48 {
}

interface Father{
    static void method(){}
//    default void method(){}
}

interface Mother{
    default void method(){}
}

interface Child extends Father, Mother{
//    void method();
}