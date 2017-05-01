package org.oca.mocks.whizlabs.finaltest;

/**
 * Created by mx on 30/4/2017.
 */
public class Question_57 {

    public static void main(String[] args) {
        UsingThisInterface.print();
    }

    interface UsingThisInterface{
        public static void main(String [] args){
            System.out.println("Hello Main");
        }
        public static void print(){
            System.out.println("Hello print4");
        }
    }
}