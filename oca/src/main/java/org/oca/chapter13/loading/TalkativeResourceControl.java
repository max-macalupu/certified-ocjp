package org.oca.chapter13.loading;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class TalkativeResourceControl extends ResourceBundle.Control {
    public List<Locale> getCandidateLocales(String baseName, Locale locale){
        List<Locale> candidateLocales = super.getCandidateLocales(baseName, locale);
        candidateLocales.forEach(System.out::println);
        return candidateLocales;
    }
}