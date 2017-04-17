package org.oca.mocks.whizlabs.test_III;

import java.util.Optional;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/11/2017.
 */
public class Question_33 {
    public static void main(String[] args) {
        process_this_interesting_and_beauty_function();
    }

    private static void process_this_interesting_and_beauty_function(){

        Optional<Object> objectOptional = Optional.ofNullable(new MiniFactory_Q33().newObject());
        Object object = objectOptional.orElseGet(() -> {
            try {
                return new MiniFactory_Q33().newObject("");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        });
        object.toString();
    }
}

class MiniFactory_Q33{
    public static Object newObject(String data) throws Exception {
        throw new Exception();
    }

    public static Object newObject(){
        return new Object();
    }
}