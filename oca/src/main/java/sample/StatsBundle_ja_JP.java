package sample;

import java.util.ListResourceBundle;

/**
 * Created by mx on 24/4/2017.
 */
public class StatsBundle_ja_JP  extends ListResourceBundle{
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    private  Object[][] contents={
            {"data",new Integer(1)},
            {"data2", new Double(4)},
            {"data3", new Float(1)}
    };
}
