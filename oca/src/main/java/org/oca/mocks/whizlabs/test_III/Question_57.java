package org.oca.mocks.whizlabs.test_III;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mx on 14/4/2017.
 */
public class Question_57 {
    public static void main(String[] args) {
        processThisAwesomeMethodForTheEnd();
    }

    private static void processThisAwesomeMethodForTheEnd(){
        Processor_Q57 processor_q57 = new SimpleDateFormaterX_Q57();
        processor_q57.processDateFormater(new SimpleDateFormat("ZZZ"));
        processor_q57.processDateFormater(new SimpleDateFormat("XXX"));
        processor_q57.processDateFormater(new SimpleDateFormat("zzz"));
        processor_q57.processDateFormater(new SimpleDateFormat("xxx"));
    }
}

interface Processor_Q57{
    public void processDateFormater(SimpleDateFormat simpleDateFormat);
}

class SimpleDateFormaterX_Q57 implements Processor_Q57{

    @Override
    public void processDateFormater(SimpleDateFormat simpleDateFormat) {
        System.out.println(simpleDateFormat.format(new Date()));
    }
}