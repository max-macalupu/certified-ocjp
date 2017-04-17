package org.oca.mocks.whizlabs.test_III;

import java.io.IOException;

/**
 * Created by mx on 13/4/2017.
 */
public class Question_47 {
    public static void main(String[] args) {
//        processThisAwesomeMethod();
        processSecondAwesomeMethod();
    }

    private static void processSecondAwesomeMethod(){
        try(Children_Q47 children_q47 = new Children_Q47()){
            children_q47.processDocument();
        }catch (Exception e){
            Throwable[] throwable = e.getSuppressed();
            for(Throwable throwsable: throwable){
                System.out.println(throwsable);
            }
        }
    }

    public static void processThisAwesomeMethod(){
        try {
//            String xx = null;
//            xx.length();
            method2();
        } catch (Exception e) {
            Throwable[] throwable = e.getSuppressed();
            for(Throwable throwsable: throwable){
                System.out.println(throwsable);
            }
            e.printStackTrace();
        }
    }

    private static void method2() throws Exception{
        try{
            method1();
//        }catch(Exception ex){
//            throw new Exception(ex);
        }finally {
            throw new IOException();
        }
    }

    private static void method1(){
//        String xx = null;
//        xx.length();
        throw new RuntimeException();
    }
}

class Children_Q47 implements AutoCloseable{

    public Children_Q47() {
    }

    public void processDocument() throws Exception{
        throw new RuntimeException();
//        String xx = null;
//        xx.length();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing object");
        throw new IOException();
    }
}