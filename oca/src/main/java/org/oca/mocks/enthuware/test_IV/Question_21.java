package org.oca.mocks.enthuware.test_IV;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_21 {

    public static void main(String[] args) {
        List<Data_Q21> dataQ21s = Arrays.asList(new Data_Q21(1), new Data_Q21(2), new Data_Q21(3));
        process(dataQ21s, (int a, int b) -> System.out.println(a*b));
        process(dataQ21s, (a, b) -> System.out.println(a-b));
        process(dataQ21s, (a, b) -> {System.out.println(a+b);});
    }

    private static void process(List<Data_Q21> dataQ21List, Process_Q21 process_q21){
        for(Data_Q21 dataQ21: dataQ21List){
            process_q21.process(dataQ21.data, dataQ21.data);
        }
    }
}

class Data_Q21{
    int data;

    public Data_Q21(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

interface Process_Q21{
    void process(int a, int b);
}
