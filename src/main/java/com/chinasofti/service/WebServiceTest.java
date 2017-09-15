package com.chinasofti.service;
import javax.jws.WebMethod;
import  javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by Administrator on 2017/8/29.
 */
@WebService
public class WebServiceTest {
    @WebMethod
    public String transWords(String words){
        String res="";
        for(char w: words.toCharArray()){
            res+=w+",";
        }
        return res;
    }

    public static void main(String[] args) {
       String addess="http://localhost:8089/service/WebServiceTest";
        Endpoint.publish(addess,new WebServiceTest());
        System.out.println("发布成功");
    }
}
