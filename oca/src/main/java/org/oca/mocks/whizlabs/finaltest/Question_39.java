package org.oca.mocks.whizlabs.finaltest;

/**
 * Created by mx on 29/4/2017.
 */
public class Question_39 {

    public static void main(String[] args) {
        process();
    }

    private static void process(){
        A<Integer> a = (x) -> System.out.print("");
        B<Integer> b = (x) -> System.out.print("");
        C<Integer> c = (x) -> System.out.print("");
    }
}

interface B<T> {
    public void print(T t);
}

interface A<R> extends B{

}
interface C <T> extends A, B{
//    public void printer(T t);
}