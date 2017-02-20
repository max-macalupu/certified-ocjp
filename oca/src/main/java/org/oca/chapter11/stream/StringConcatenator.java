package org.oca.chapter11.stream;

import java.util.Arrays;

/**
 * Created by mx on 19/2/2017.
 */
public class StringConcatenator {

    public static String result = "";
    public static void contatStr(String str){
        result = result + " " + str;
    }
}

class StringSplitAndConcatenate{
    public  static void main(String [] args){
        String words [] = "This is a message from my own stream because I know how it works".split(" ");
//        Arrays.stream(words).forEach(StringConcatenator::contatStr);
        Arrays.stream(words).parallel().forEach(StringConcatenator::contatStr);
        System.out.printf("Resultado final: " + StringConcatenator.result);
    }
}