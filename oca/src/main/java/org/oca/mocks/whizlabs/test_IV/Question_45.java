package org.oca.mocks.whizlabs.test_IV;

import com.sun.deploy.util.StringUtils;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/20/2017.
 */
public class Question_45 {

    public static void main(String[] args) {
        new Question_45().testMethodWithNullPointerException();
        new Question_45().testMethod01();
        try {
            new Question_45().testOtherMethodThatExtendsDirectlyFromException();
        } catch (SomeOtherException e) {
            e.printStackTrace();
        }
    }

    private  void testMethodWithNullPointerException() throws NullPointerException{
        throw new NullPointerException();
    }

    private void testOtherMethodThatExtendsDirectlyFromException() throws SomeOtherException{

    }

    private  void testMethod01() throws RuntimeExceptionCustom_Q45{
        throw new RuntimeExceptionCustom_Q45("sss", null, "xxx");
    }
}

class SomeOtherException extends Exception{

}

class RuntimeExceptionCustom_Q45 extends RuntimeException {

    private String message;

    public RuntimeExceptionCustom_Q45(String message, Throwable cause, String message1) {
        super(message, cause);
        this.message = message1;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}