package org.oca.mocks.whizlabs.diagnostic;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_33 {

    public static void main(String[] args) {

        int finalResult = calculate(Arrays.asList(5,4,1,9,11), (Integer x, Integer y) -> x+y);
        System.out.println(finalResult);

    }

    static int calculate(List<Integer> arrayData, BiFunction<Integer, Integer, Integer> biFunction){
        if(arrayData.isEmpty()){
            return 0;
        }else if(arrayData.size() == 1){
            return arrayData.get(0);
        }
        int sum = arrayData.get(0);
        for(int i=0; i<arrayData.size(); i++){
            sum = biFunction.apply(sum, arrayData.get(i));
        }
        return sum;
    }
}
