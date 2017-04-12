package org.oca.mocks.whizlabs.test_III;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by mx on 10/4/2017.
 */
public class Question_30 {
    public static void main(String[] args) {
        process_this_great_function();
    }

    private static void process_this_great_function(){
        Stream<String> stream = Stream.of("the","awesome","song","is","here");
        String output = stream.collect(Collectors.joining(" ","","")).toUpperCase();
        System.out.println(output);
    }
}
