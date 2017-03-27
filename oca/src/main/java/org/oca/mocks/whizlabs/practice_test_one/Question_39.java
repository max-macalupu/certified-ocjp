package org.oca.mocks.whizlabs.practice_test_one;

import java.util.function.Predicate;

/**
 * Created by mx on 25/3/2017.
 */
public class Question_39 {
    public static void main(String[] args) {
        Validator validator = new Validator(true);
//        System.out.println(new Question_39().validate(validator, validator -> validator.isValid()));
        System.out.println(new Question_39().validate(validator, validator1 -> validator1.isValid()));
    }

    public boolean validate(Validator validator, Predicate<Validator> predicate){
        return predicate.test(validator);
    }
}

class Validator{
    private boolean valid;

    public Validator(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
}