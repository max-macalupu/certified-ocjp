package org.oca.mocks.whizlabs.oca.section_09;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_06 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(5);
        list.add(5);
        System.out.println(Integer.max((int)list.get(0),1));
    }
}
