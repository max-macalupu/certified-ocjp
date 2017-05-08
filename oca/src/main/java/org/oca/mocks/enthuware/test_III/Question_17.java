package org.oca.mocks.enthuware.test_III;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 6/5/2017.
 */
public class Question_17 {

    public static void main(String[] args) {
        processTHis();
    }

    private static void processTHis(){
        List<Integer> integerList = Arrays.asList(1, 5, 15, 10);
        integerList.stream().map(Processor_Q17::new).forEach(Processor_Q17::process);
    }
}

class Processor_Q17{
    Integer value;

    public Processor_Q17(Integer value) {
        this.value = value;
    }

    public void process(){
        System.out.println("Hello...!" + value);
    }
}