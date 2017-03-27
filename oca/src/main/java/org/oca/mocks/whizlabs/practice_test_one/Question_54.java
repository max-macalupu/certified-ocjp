package org.oca.mocks.whizlabs.practice_test_one;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by mx on 26/3/2017.
 */
public class Question_54 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMMM", Locale.US);
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
