package org.oca.mocks.whizlabs.finaltest;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by mx on 30/4/2017.
 */
public class Question_55 {
    public static void main(String[] args) {
        processTHisInterestingFunction();
    }

    private static void processTHisInterestingFunction(){
        String s = "1245.1235";
        Number N ;
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.FRANCE);
        numberFormat.setMaximumFractionDigits(2);
        try{
            N = numberFormat.parse(s);
        }catch (NumberFormatException nu){
            System.out.println("Exception");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
