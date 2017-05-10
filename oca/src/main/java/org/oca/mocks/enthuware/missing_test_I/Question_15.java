package org.oca.mocks.enthuware.missing_test_I;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by mx on 9/5/2017.
 */
public class Question_15 {
    public static void main(String[] args) {
        Locale locale = new Locale("en","US");
        ResourceBundle rs = ResourceBundle.getBundle("testMyBundle", locale);
        Object ob = rs.getObject("data");

//        Object obj = rs.get
    }
}
