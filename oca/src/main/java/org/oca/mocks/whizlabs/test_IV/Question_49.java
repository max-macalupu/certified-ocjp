package org.oca.mocks.whizlabs.test_IV;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/18/2017.
 */
public class Question_49 extends B_Q49 implements A_Q49{
    public static void main(String[] args) {
        processThisAwesomeMethodAsFunction();
    }

    private static void processThisAwesomeMethodAsFunction(){
        A_Q49 aQ49 = new Question_49();
        aQ49.print();
    }

    @Override
    public void print() {

    }
}

interface A_Q49{
    void print();
}

class B_Q49{

}
