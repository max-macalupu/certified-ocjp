package org.oca.mocks.whizlabs.trial;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class Question_16 {

    public static void main(String[] args) {
        Locale locale = new Locale.Builder().setLanguage("it").setRegion("IT").build();
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", locale);
        Enumeration<String> keys = resourceBundle.getKeys();
        while(keys.hasMoreElements()){
            String key = keys.nextElement();
            System.out.println("Key: " + key +", Value: " + resourceBundle.getString(key));
        }
    }

}
