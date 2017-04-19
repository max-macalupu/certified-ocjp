package org.oca.mocks.whizlabs.test_IV;

import java.util.*;

/**
 * Created by AVANTICA TECHNOLOGIES on 4/18/2017.
 */
public class Question_51 {
    public static void main(String[] args) {
        processThisAwesomeFunctionAsBusinessProcess();
    }

    private static void processThisAwesomeFunctionAsBusinessProcess(){

//        ResourceBundle.Control control = ResourceBundle.Control.getControl(ResourceBundle.Control.FORMAT_CLASS);
        ResourceBundle.Control control = ResourceBundle.Control.getControl(ResourceBundle.Control.FORMAT_DEFAULT);
//        Locale locale = new Locale("de");
        Locale locale = Locale.getDefault();
//        ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesByDefault", locale, control);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("MessagesByDefault");
        String data = resourceBundle.getString("YES");
        System.out.println(data);
    }
}
//
//class MessagesByDefault extends ListResourceBundle{
//
//    @Override
//    protected Object[][] getContents() {
//        return data;
//    }
//
//    static final Object[][] data = {{"data","value"},{"data2","value2"},{"YES","YES_VAL"}};
//}
class MessagesByDefault_en_US extends ResourceBundle{

    private String keys = "AMMessage PMMessage";

    public Object handleGetObject(String key) {
        if (key.equals("AMMessage")) return "Good morning";
        if (key.equals("PMMessage")) return "Good evening";

        return null;
    }

    public Enumeration getKeys() {
        StringTokenizer keyTokenizer = new StringTokenizer(keys);

        return keyTokenizer;
    }
}
