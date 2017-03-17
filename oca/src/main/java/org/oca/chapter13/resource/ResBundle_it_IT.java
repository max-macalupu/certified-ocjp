package org.oca.chapter13.resource;

import java.util.ListResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class ResBundle_it_IT extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents= {
        {"MovieName","Che chella Giornata"},
        {"GrossRevenue",(Long) 523533L},
        {"Year",(Integer)2011}
    };
}
