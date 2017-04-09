package org.oca.mocks.whizlabs.oca.section_09;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_15 {
    public static void main(String[] args) {
        String stringOne = new String();
        String stringTwo = new String(new byte[]{88, 89});
        String stringThree = new String(new char[]{'a','b'});
        String stringFour = new String(new StringBuilder("ABC"));

        System.out.println(stringOne);
        System.out.println(stringTwo);
        System.out.println(stringThree);
        System.out.println(stringFour);
    }
}