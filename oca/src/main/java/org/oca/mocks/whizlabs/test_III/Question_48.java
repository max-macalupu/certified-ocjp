package org.oca.mocks.whizlabs.test_III;

/**
 * Created by mx on 13/4/2017.
 */
public class Question_48 {
    public static void main(String[] args) {
        processThisAwesomeMethod();
    }

    private static void processThisAwesomeMethod(){
        MammalImpl_Q48 mammalImplQ48 = new MammalImpl_Q48() {
            @Override
            public String getColor() {
                return null;
            }
        };
    }
}

abstract class MammalImpl_Q48 implements Mammal_Q48{
    public abstract String getColor();

    public Integer getHeight(){
        return 3;
    }

    public Integer getAge(){
        return 6;
    }
}

interface Animal_Q48{
    public default Integer getHeight(){
        return 3;
    }

    public static Integer getAge(){
        return 2;
    }
}

interface Mammal_Q48 extends Animal_Q48{
    public String getColor();
}