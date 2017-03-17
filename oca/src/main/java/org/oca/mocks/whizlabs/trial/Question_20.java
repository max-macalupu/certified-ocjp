package org.oca.mocks.whizlabs.trial;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class Question_20 {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("fr"));

        Locale locale = new Locale("de", "DE");

        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", locale);

        String message = resourceBundle.getString("so");

        System.out.println(message);
    }

}
