package org.servlet.core.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmpAppContext {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");

//        Address a = context.getBean("address1", Address.class);
//        System.out.println(a);

        Employee emp=context.getBean("e", Employee.class);
        emp.show();
    }
}
