package org.oca.mocks.whizlabs.diagnostic;

/**
 * Created by mx on 19/3/2017.
 */
public class Question_12 {

    public static void main(String[] args) {
        String text = new String("Hello!");

        switch(text){
            case "Hello!":
                System.out.println("Hello!");break;
            default:
                System.out.println("Default");break;
        }

        if(text=="Hello!"){
            System.out.println("Hello...");
        }else{
            System.out.println("Nothing");
        }
    }
}