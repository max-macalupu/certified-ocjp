package org.oca.mocks.whizlabs.test_II;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 30/3/2017.
 */
public class Question_07 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("US");
        StringBuffer stringBuffer_uk = new StringBuffer("UK");
        List<StringBuffer> stringBufferList = Arrays.asList(stringBuffer, stringBuffer_uk);
//        List<StringBuffer> stringBufferList1 = stringBufferList.stream().collect(Collectors.joining("-","<-","->"));
        System.out.println(stringBufferList);
//        System.out.println(stringBufferList1);
    }
}
