package org.oca.mocks.enthuware.test_IV;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mx on 8/5/2017.
 */
public class Question_43 {
    public static void main(String[] args) {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("z", Locale.FRANCE);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("zzzz", Locale.FRANCE);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
