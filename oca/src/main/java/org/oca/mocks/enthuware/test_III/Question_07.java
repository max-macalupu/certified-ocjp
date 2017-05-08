package org.oca.mocks.enthuware.test_III;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mx on 4/5/2017.
 */
public class Question_07 {
    public static void main(String[] args) {
        processThisInterestingFunction();
    }

    private static void processThisInterestingFunction(){
//        m3();
    }

    public List<Shape_Q07> m4(ArrayList<? extends  Shape_Q07> list){
        List<? extends  Shape_Q07>list1 = new ArrayList<>();
//        list1.addAll(list);
//        return list1;
        return null;
    }

    private List<? extends Shape_Q07> m3 (ArrayList<? extends Shape_Q07> strList){
        List<Shape_Q07> q07List = new ArrayList<>();
        q07List.add(new Shape_Q07());
        q07List.addAll(strList);
        return q07List;
    }


}

class Shape_Q07{
    private int id;

    public Shape_Q07() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

class ShapeChild01_Q07 extends Shape_Q07{

}

class ShapeChild02_Q07 extends Shape_Q07{

}