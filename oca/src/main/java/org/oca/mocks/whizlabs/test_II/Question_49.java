package org.oca.mocks.whizlabs.test_II;

import java.io.IOException;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_49 {
    public static void main(String[] args) {
        processThisInterestingMethod();
    }

    private static void processThisInterestingMethod(){

        try{
            throw new IOException();
        } catch (IOException | RuntimeException e) {
//            e = new RuntimeException();
            e.printStackTrace();
        }

    }
}