package org.oca.mocks.whizlabs.oca.section_07;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_08 {
    public static void main(String[] args) {

//        interfaceQ18 _interfaceQ08 = new interfaceQ08() {};
//        _interfaceQ08.toString2();
//        interfaceQ08.method3();
    }
}

interface interfaceQ08{
    public default String toString2(){
      return "xx";
    };

    String toString();

    public static void method3(){
        System.out.println("hello");
    }

    public default void method1(){

    }

    public default Object clone() throws CloneNotSupportedException{
        return String.valueOf(1);
    }
}