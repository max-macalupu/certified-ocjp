package org.oca.mocks.enthuware.trial;

import java.io.IOException;

/**
 * Created by max.macalupu on 3/10/2017.
 */
public class Question_03 {

    public static void main(String[] args) throws Exception {
        try(Device d1 = new Device("D1");
            Device d2 = new Device("D3")){
            throw new Exception("test");
        }catch (Exception ex){
            System.out.println("exceptioooon");
        }
    }
}

class Device implements AutoCloseable{

    public String header = null;

    public Device(String header) throws IOException{
        this.header = header;
        if("D2".equals(this.header))throw new IOException("UnKnow");
        System.out.println(header+" opened");
    }

    public String read() throws IOException{
        return "";
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing... " + header);
        throw new RuntimeException("RTE exception, " + header);
    }
}