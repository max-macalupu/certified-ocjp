package org.oca.mocks.whizlabs.oca.section_09;

/**
 * Created by mx on 8/4/2017.
 */
public class Question_11 {

    public static double defaultDouble;
    public static long defaultLong;
    public static float defaultFloat;

    public static void main(String[] args) {
        System.out.println(defaultFloat);
        System.out.println(defaultLong);
        System.out.println(defaultDouble);

        StringBuilder stringBuilder = new StringBuilder("WhizLabs");
        char[] chars = new char[5];
        stringBuilder.getChars(1, 5, chars, 1);
        for(char character: chars){
            System.out.println((int)character);
        }
        System.out.println(chars);

        Integer [] arrayInteger = new Integer[4];
        arrayInteger[0] = 1;
        arrayInteger[1] = 2;
        arrayInteger[2] = 3;
        arrayInteger[3] = 4;
        System.out.println(arrayInteger);
    }
}