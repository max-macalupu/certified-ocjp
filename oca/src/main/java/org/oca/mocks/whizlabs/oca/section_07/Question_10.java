package org.oca.mocks.whizlabs.oca.section_07;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_10 {
    public static void main(String[] args) {
//        C c = new C();
//        A a = (A)c;
//        System.out.println(a);
        A a = new A();
        C c = (C) a;
        System.out.println(c);
    }
}

interface I{

}

class A implements I{

}

class C extends A implements I{

}
