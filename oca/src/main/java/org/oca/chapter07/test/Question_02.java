package org.oca.chapter07.test;

/**
 * Created by max.macalupu on 2/27/2017.
 */
public class Question_02 {

    public static void main(String[] args) {
        try{
            ChainedException.foo();
        }catch(Exception e){
            System.out.println(e.getClass());
        }
    }
}
class ChainedException{
    public static void foo(){
        try{
            throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            RuntimeException runtimeException = new RuntimeException(e);
            runtimeException.initCause(e);
            throw  runtimeException;
        }
    }
}
