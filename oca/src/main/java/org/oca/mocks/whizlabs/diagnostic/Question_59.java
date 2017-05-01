package org.oca.mocks.whizlabs.diagnostic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by mx on 18/3/2017.
 */
public class Question_59 {

    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("d MMM ''yy");
        System.out.println(dateFormat.format(new Date(0)));
    }
}