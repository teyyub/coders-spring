package org.servlet.core.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestObjAppContext {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");

        Employee emp=(Employee) context.getBean("e");
        emp.show();
    }
}
