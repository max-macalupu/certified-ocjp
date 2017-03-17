package org.oca.mocks.whizlabs.diagnostic;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_35 {

    public static void main(String[] args) {
        Integer i = 0; String s = ""; Object o = null;

        MyClassType myClassType = new MyClassType(i, s, o);
    }
}

class MyClassType< N extends  Object, M extends  String, U>{
//    class MyClassType<>{

    public MyClassType(N n, M m, U u) {
        System.out.println(n + " " + m + " " + u);
    }
}
