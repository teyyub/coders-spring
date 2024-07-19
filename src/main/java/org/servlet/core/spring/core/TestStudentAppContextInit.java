package org.servlet.core.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentAppContextInit {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("StudentBean.xml");

        Student student= context.getBean("studentObj", Student.class);
        student.displayInfo();
        context.close();

//        Employee emp =   context.getBean("e", Employee.class);
//        emp.show();
    }
}
