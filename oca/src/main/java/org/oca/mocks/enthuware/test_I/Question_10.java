package org.oca.mocks.enthuware.test_I;

/**
 * Created by mx on 1/5/2017.
 */
public class Question_10 {
    public static void main(String[] args) {
        processThis();
    }

    private static void processThis(){
        int value = 1_000_000;
        switch (value){
            case 1_000_000:
                System.out.println("YES");break;
            case 10000000:
                System.out.println("NOP");break;
        }
    }
}
