package org.oca;

import java.util.function.Predicate;

/**
 * Created by mx on 25/2/2017.
 */
public class Test2 {

    public static void comer(){

    }

    public static void main(String [] args){
//        System.out.println(test((int i) -> i == 5));
        Padre[] padres = new Padre[5];
        padres[0] = new Hijo();
        padres[1] = new Padre();
        padres[2] = new Hijo();
        padres[3] = new Padre();
        padres[4] = new Hijo();
        for(Padre padre: padres){
            padre.printParametro("Hola");
        }

        Animal animal = () -> System.out.println("hola");
        animal.comer3();

//        Test2.comer();
//        Test2::comer;
    }

//    anim

    private static boolean test(Predicate<Integer> p){
        return p.test(5);
    }
}
class Padre{
    public void printParametro(String parametro){
        System.out.println("padre " + parametro);
    }
}

class Hijo extends Padre{
    public void printParametro(String hijo){
        System.out.println("Hijo " + hijo);
    }
}

//@FunctionalInterface
interface Animal{
    public String stringValue = "test";
//    abstract void comer2();
    void comer3();
}