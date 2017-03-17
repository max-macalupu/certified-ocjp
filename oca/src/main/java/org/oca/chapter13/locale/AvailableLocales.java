package org.oca.chapter13.locale;

import sun.rmi.transport.Channel;
import sun.rmi.transport.Endpoint;
import sun.rmi.transport.Target;
import sun.rmi.transport.Transport;

import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.Locale;

/**
 * Created by mx on 22/2/2017.
 */
public class AvailableLocales {

    public static void main(String [] args){
        System.out.printf("Let's print the current local: %s %n",Locale.getDefault());

        Locale[] locales = Locale.getAvailableLocales();

        Arrays.stream(locales).filter(x -> x.getDisplayName().contains("eru")).forEach(locale ->
                            System.out.printf("The locale code is: %s and the name is: %s %n", locale, locale.getDisplayName()));

        Arrays.stream(locales).filter(x -> x.getLanguage().equals("en")).forEach(locale ->
                            System.out.printf("The locale that speak english are: %s and the name is: %s %n", locale, locale.getDisplayName()));

    }

}