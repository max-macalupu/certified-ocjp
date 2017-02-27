package org.oca.chapter07.test;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class Question_03 {

    public static void main(String[] args) {
        try{
            ChainedExceptions.foo();
        }catch(Exception e){
            System.out.println(e.getClass());
        }
    }
}

class ChainedExceptions{
    public static void foo(){
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
//            throw  new Exception(e);
        }
    }
}
