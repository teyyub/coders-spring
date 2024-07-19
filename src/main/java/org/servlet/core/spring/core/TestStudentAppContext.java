package org.servlet.core.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestStudentAppContext {
    public static void main(String[] args) {
//        Resource resource=new ClassPathResource("Bean.xml");
        ApplicationContext context=new ClassPathXmlApplicationContext("StudentBean.xml");

//        Student student= context.getBean("studentObj",Student.class);
//        student.displayInfo();

//        Employee emp =   context.getBean("e", Employee.class);
//        emp.show();
    }
}
