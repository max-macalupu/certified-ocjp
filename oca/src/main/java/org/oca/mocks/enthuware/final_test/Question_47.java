package org.oca.mocks.enthuware.final_test;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_47 {
    public static void main(String[] args) {
        SpecialPicker<Integer> specialPicker = new SpecialPicker<>();
        System.out.println(specialPicker.getPick(1,2).intValue()+1);
    }
}

class SpecialPicker<K>{
    public K getPick(K k1, K k2){
        System.out.println(k1.hashCode()+ " " + k2.hashCode());
        return k1.hashCode()>k2.hashCode()?k1:k2;
    }
}