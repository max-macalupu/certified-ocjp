package org.oca.mocks.enthuware.final_test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_03 {
    public static void main(String[] args) {
        String sentence1 = "hola aqui yo estoy";
        String sentence2 = "hola estoy de nuevo";
        String sentence3 = "hola ya me retiro";
        List<String> stringList = Arrays.asList(sentence1, sentence2, sentence3);

        Stream<String> data = stringList.stream().flatMap(x -> Stream.of(x.split("[ ,.!?\r\n]"))).filter(x -> x.length()>0).distinct();
        data.forEach(System.out::println);
    }
}
