package org.oca.chapter13.resource;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class Main {

    public static void main(String[] args) {
        LocalizedBoxOfficeHits localizedBoxOfficeHits =new LocalizedBoxOfficeHits();

        Locale locale = Locale.getDefault();
        localizedBoxOfficeHits.printMovieDetails(ResourceBundle.getBundle("ResBundle", locale));

        Locale _locale = new Locale("it","IT","");
        localizedBoxOfficeHits.printMovieDetails(ResourceBundle.getBundle("ResBundle", _locale));
    }
}
