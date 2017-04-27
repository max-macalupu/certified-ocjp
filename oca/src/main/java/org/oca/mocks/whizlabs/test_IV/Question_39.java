package org.oca.mocks.whizlabs.test_IV;

/**
 * Created by mx on 18/4/2017.
 */
public class Question_39 {
    public static void main(String[] args) {
        process();
    }

    private static void process(){
        Changer_Q39<String> stringChanger_q39 = String::toLowerCase;
        String str = stringChanger_q39.change("xxxXDDASA");
        System.out.println(str);

        Changer_Q39<String> stringChanger_q391 = String::toLowerCase;
        String str2 = stringChanger_q391.change("MAX");
        System.out.println(str2);

        Changer_Q39<Test_Q39> testQ39ChangerQ39 = Test_Q39::showValue;
        String str3 = testQ39ChangerQ39.change(new Test_Q39("hole")).toString();
        System.out.println(str3);
    }
}

interface Changer_Q39<T>{
    T change(T t);
}

class Test_Q39 implements CharSequence{

    public static Test_Q39 with(String value){
        return new Test_Q39(value);
    }

    public Test_Q39 showValue(){
        return this;
    }

    private String value = "";

    public Test_Q39(String value) {
        this.value = value;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}