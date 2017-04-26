package org.oca.mocks.whizlabs.test_II;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by mx on 24/4/2017.
 */
public class Question_59 {
    public static void main(String[] args) {
        Locale locale = new Locale("ja","JP");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("sample.StatsBundle", locale);
        Integer data = (Integer) resourceBundle.getObject("data");
//        String data = resourceBundle.getString("data");
        System.out.println(data);
    }
}
