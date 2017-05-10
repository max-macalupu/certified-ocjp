package org.oca.mocks.enthuware.final_test;

import java.util.List;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_35 {
    public static void main(String[] args) {
        List<String> data = null;
        List<? super String> doIt = doIt(data);
        List doIt2 = doIt(data);
    }

    public static <E extends  CharSequence> List< ? super E> doIt(List<E> nums){
        return nums;
    }
}