package org.oca.mocks.enthuware.test_IV;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_05 {
    public static void main(String[] args) {
        List<String> arrayData = Arrays.asList("Hola","que","tal","como","estas","bientu");
//        int x = arrayData.stream().filter(x -> x.length()>4).collect(Collectors.counting());
        long xx = arrayData.stream().filter(x -> x.length()>2).collect(Collectors.counting());
        System.out.println(xx);
    }
}
