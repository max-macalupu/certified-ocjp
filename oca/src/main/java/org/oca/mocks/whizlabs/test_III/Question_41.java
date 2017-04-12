package org.oca.mocks.whizlabs.test_III;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mx on 12/4/2017.
 */
public class Question_41 {
    public static void main(String[] args) {
        processThisGreatFunctionForMyTestPracticing();;
    }

    public static void processThisGreatFunctionForMyTestPracticing(){
        List<Data_Q41> dataQ41List = getProcessQ41WithMockData();
        process(dataQ41List, (d) -> System.out.println(2* d.getCode()));
        System.out.println();
        process(dataQ41List, (d) -> System.out.print(24));
    }

    private static List<Data_Q41> getProcessQ41WithMockData(){
        return Arrays.asList(new Data_Q41(1),
                                new Data_Q41(2),
                                new Data_Q41(6) );
    }

    private static void process(List<Data_Q41> dataList, Process_Q41 process_q41){
        for(Data_Q41 dataQ41: dataList){
            process_q41.process(dataQ41);
        }
    }
}
interface Process_Q41{
    void process(Data_Q41 value);
}

class Data_Q41{
    private int code;

    public Data_Q41(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Data_Q41{" +
                "code=" + code +
                '}';
    }
}