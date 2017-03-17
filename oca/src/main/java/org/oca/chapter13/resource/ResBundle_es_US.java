package org.oca.chapter13.resource;

import java.util.ListResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class ResBundle_es_US extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents= {
        {"MovieName","Movie for US"},
        {"GrossRevenue",(Long) 59103953L},
        {"Year",(Integer)2051}
    };
}
