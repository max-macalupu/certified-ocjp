package org.oca.mocks.whizlabs.oca.section_09;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_13 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("ABCDEFG");
//        stringBuilder.insert(10, 'Z');
        stringBuilder.deleteCharAt(6);
        int x = stringBuilder.capacity();
        stringBuilder.trimToSize();
        int y = stringBuilder.capacity();
        System.out.println(x + y);
    }
}
