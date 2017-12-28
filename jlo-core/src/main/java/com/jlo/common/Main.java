package com.jlo.common;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lenovo on 2017/12/28.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-config.xml");
        context.start();
        System.out.println("system start.");
        boolean flg = true;
        while (flg){
            Thread.sleep(10000);
        }

    }
}
