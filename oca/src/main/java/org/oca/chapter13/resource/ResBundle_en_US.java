package org.oca.chapter13.resource;

import java.util.ListResourceBundle;

/**
 * Created by mx on 11/3/2017.
 */
public class ResBundle_en_US extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents= {
        {"MovieName","Movie for US2"},
        {"GrossRevenue",(Long) 591039533L},
        {"Year",(Integer)2091}
    };
}
