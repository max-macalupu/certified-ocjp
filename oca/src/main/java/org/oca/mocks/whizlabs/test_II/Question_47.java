package org.oca.mocks.whizlabs.test_II;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_47 {

    public static void main(String[] args) {
        processThisMethodAsSwitchProofConcept();
    }

    private static void processThisMethodAsSwitchProofConcept(){
        String stringToTest = "";
        final String StringSwitch = "Hello";

        switch (stringToTest){
            case StringSwitch:
                System.out.println("Hello");break;
            default:
                System.out.println("World");break;
        }
    }
}
