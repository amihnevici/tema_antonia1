package com;

import com.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        Hello obj = (Hello) context.getBean("helloBean");
        obj.printHello();
    }
}