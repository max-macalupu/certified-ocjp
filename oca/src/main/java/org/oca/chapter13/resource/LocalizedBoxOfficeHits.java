package org.oca.chapter13.resource;

import java.util.ResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class LocalizedBoxOfficeHits {

    public void printMovieDetails(ResourceBundle resourceBundle){
        String movieName = resourceBundle.getString("MovieName");
        Long revenue = (Long) (resourceBundle.getObject("GrossRevenue"));
        Integer year = (Integer)(resourceBundle.getObject("Year"));
        System.out.println("Movie: " + movieName+", GrpssRevenue: " + revenue + ", Year: " + year);
    }
}
