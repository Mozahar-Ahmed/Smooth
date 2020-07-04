package exceptionHandling;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ThrowKeyword {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            throw new Exception("CustomizeYourOwnException");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Stop here!!");
    }
        }



