package org.oca.mocks.whizlabs.test_II;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_40 {
    public static void main(String[] args) {
        processTHisInterestingFUnction();
    }

    private static void processTHisInterestingFUnction(){
        List<Integer> integerList = Arrays.asList(1, 5, 10,2 , 5);
        integerList.stream().forEach(i -> (new Data_Q40(i)).outPut());
        integerList.stream().map( x -> {
            Function<Integer, Data_Q40> function = Data_Q40::new;;
            return function.apply(x);
        }).forEach(Data_Q40::outPut);

    }
}

class Data_Q40{
    private int id;

    public Data_Q40(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void outPut(){
        System.out.println(id);
    }

    @Override
    public String toString() {
        return "Data_Q40{" +
                "id=" + id +
                '}';
    }
}