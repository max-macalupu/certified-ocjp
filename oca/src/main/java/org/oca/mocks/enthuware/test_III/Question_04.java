package org.oca.mocks.enthuware.test_III;

import java.util.Optional;

/**
 * Created by mx on 4/5/2017.
 */
public class Question_04 {
    public static void main(String[] args) {
        processThisInterestingFUnction();
    }

    private static void processThisInterestingFUnction(){
        Optional<String> stro = Optional.of(getValue());
        System.out.println(stro.isPresent());
        System.out.println(stro.get());
        System.out.println(stro.orElse(null));
    }

    private static String getValue(){
        return null;
    }
}
