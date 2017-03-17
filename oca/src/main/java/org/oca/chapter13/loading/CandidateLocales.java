package org.oca.chapter13.loading;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class CandidateLocales {

    public static void loadResourceBundle(String resourceBundleName, Locale locale){

        ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceBundleName, locale, new TalkativeResourceControl());

        String rbLocaleName = resourceBundle.getLocale().toString();

        if(rbLocaleName.equals("")){
            System.out.println("Loaded the default property file with name: " + resourceBundleName);
        }else{
            System.out.println("Loaded the resource bundle for the locale: " + rbLocaleName);
        }
    }

    public static void main(String[] args) {
        loadResourceBundle("ResourceBundle", new Locale("it", "IT", "Rome"));
    }
}