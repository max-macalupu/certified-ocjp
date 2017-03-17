package org.oca.mocks.whizlabs.trial;

/**
 * Created by mx on 11/3/2017.
 */
public class Question_22 {

    @FunctionalInterface
    public interface Sample<E>{
        E getSomething();
        default void someThing(E e){};
    }
}