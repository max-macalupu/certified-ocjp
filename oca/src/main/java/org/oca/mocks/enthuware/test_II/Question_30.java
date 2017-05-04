package org.oca.mocks.enthuware.test_II;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by mx on 3/5/2017.
 */
public class Question_30 {
    public static void main(String[] args) {
        processThisInterestingFunction();
    }

    private static void processThisInterestingFunction(){
        Locale.setDefault(new Locale("fr", "CA"));
        Locale l = new Locale("jp", "JP");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("appmessage",l);
        System.out.println(resourceBundle.getString("test"));
    }
}
