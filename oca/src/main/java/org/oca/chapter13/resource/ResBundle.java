package org.oca.chapter13.resource;

import java.util.ListResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class ResBundle extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents= {
        {"MovieName","Avatar"},
        {"GrossRevenue",(Long) 123142L},
        {"Year",(Integer)4345}
    };
}
