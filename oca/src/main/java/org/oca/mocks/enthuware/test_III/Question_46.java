package org.oca.mocks.enthuware.test_III;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_46 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("1", "2", "4");
        List<String> stringList2 = Arrays.asList("11", "22", "44");
        Stream<List<String>> stream = Stream.of(stringList, stringList2);
        stream.flatMap(x -> x.stream()).forEach(x -> System.out.println(x));
        System.out.println("*****************************");
        stream.flatMap(x -> Stream.of(x)).forEach(x -> System.out.println(x));
    }
}
