package org.oca.mocks.whizlabs.oca.section_09;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.format.DateTimeFormatter;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_17 {
    public static void main(String[] args) {
        Year year = Year.of(2016);
        LocalDate localDate = year.atMonthDay(MonthDay.of(4, 20));
        System.out.println(localDate);

        DateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
//        System.out.println(dateFormat.format(LocalDate.now()a));
        DateTimeFormatter dateFormatter =  DateTimeFormatter.ISO_DATE;
//        DateTimeFormatter _dateFormatter =  DateTimeFormatter.BASIC_ISO_DATE;
        System.out.println(dateFormatter.format(localDate));
    }
}
