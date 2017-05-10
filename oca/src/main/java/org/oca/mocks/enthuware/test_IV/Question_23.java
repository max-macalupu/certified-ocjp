package org.oca.mocks.enthuware.test_IV;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_23 {
    public static void main(String[] args) {
        List<String> listData = Arrays.asList("hola", "aqui", "toy");
        System.out.println(listData.stream().collect(Collectors.joining("-", "/", "//")));
        System.out.println(listData.
                    stream().
                    flatMap(x -> Arrays.asList(x).stream()).
                    collect(Collectors.joining("-", "/", "//")));
    }
}
