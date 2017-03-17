package org.oca.mocks.whizlabs.diagnostic;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by max.macalupu on 3/17/2017.
 */
public class Question_24 {
    public static void main(String[] args) {


        //FRAGMENT 01
//        Locale locale = new Locale();
//        DateFormat dateFormat = DateFormat.getInstance(DateFormat.DEFAULT);

        //FRAGMENT 02
//        Locale locale = new Locale();
        DateFormat dateFormat = DateFormat.getInstance();
        System.out.println(dateFormat.format(new Date()));

        //FRAGMENT 03
        Locale locale = Locale.getDefault();
        DateFormat _dateFormat = DateFormat.getInstance();
        System.out.println(_dateFormat.format(new Date()));
    }
}