package org.oca.mocks.enthuware.test_III;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * Created by mx on 5/5/2017.
 */
public class Question_15 {
    public static void main(String[] args) {
        prcessHThisAwesome();
    }

    private static void prcessHThisAwesome(){
        Data_Q15 d = new Data_Q15(10);
        ArrayList<Data_Q15> arrayList = new ArrayList<>();
        arrayList.add(d);
        new Question_15().filterData(arrayList, dd -> dd.getValue()%2==0);
    }

    public void filterData(ArrayList<Data_Q15> dataQ15s, Predicate<Data_Q15> predicate){
        Iterator<Data_Q15> iterator = dataQ15s.iterator();
        while (iterator.hasNext()){
            if(predicate.test(iterator.next())){
                iterator.remove();
            }
        }
    }
}

class Data_Q15{
    int value;

    public Data_Q15(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}