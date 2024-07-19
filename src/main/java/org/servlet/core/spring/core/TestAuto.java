package org.servlet.core.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAuto {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("AutowiringBean.xml");

        Employee emp= context.getBean("e1", Employee.class);
        emp.show();
    }

}
