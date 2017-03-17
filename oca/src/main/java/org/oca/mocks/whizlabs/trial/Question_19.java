package org.oca.mocks.whizlabs.trial;

/**
 * Created by mx on 11/3/2017.
 */
public class Question_19 {

    public static void main(String[] args) {
        int number1 = 0b111; //binary start with 0b
        int number2 = 0_111; //Octal start with 0_
        int number3 = 0x111; //Hexa start with 0x
        int number4 = 0_20;

        System.out.println(number1 + number2 + number3 + number4);
    }
}