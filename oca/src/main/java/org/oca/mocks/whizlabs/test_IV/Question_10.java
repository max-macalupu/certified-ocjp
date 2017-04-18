package org.oca.mocks.whizlabs.test_IV;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/17/2017.
 */
public class Question_10 {

    public static void main(String[] args) {
        processThisDirtyFunctionAsMethod();
    }

    private static void processThisDirtyFunctionAsMethod(){
        List<String> stringList = Arrays.asList("Hello", "World", "For", "Just", "YouMx", "And", "NoMore");
        Map<Boolean,List<String>> booleanListMap = stringList.stream().collect(Collectors.groupingBy(x -> x.length() > 4));
        System.out.println(booleanListMap);
    }
}