package org.oca.mocks.enthuware.test_III;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_16 {

    public static void main(String[] args) {
        processTHis();
    }

    private static void processTHis(){

        List<Character> characterList = Arrays.asList('U', 'R', 'A');
        characterList.stream().filter( x -> x=='A').
                peek(x -> System.out.println("Old Rating " + x)).
                map(x -> x=='A'?'R':x).
                peek(x -> System.out.println("New Rating " + x)).
                forEach(x -> System.out.println(x));
    }
}
