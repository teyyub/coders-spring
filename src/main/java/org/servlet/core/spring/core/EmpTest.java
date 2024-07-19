package org.servlet.core.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
    public static void main(String[] args) {

//        Address commonAddress =  new Address("a","b","c");
//        Employee emp = new Employee(1,"semed",commonAddress);
//        Employee emp1 = new Employee(2,"vurgun",commonAddress);
//        Employee emp2 = new Employee(3,"azad",commonAddress);
//
//        Address commonAddress1 =  new Address("aa","bb","cc");
//        Employee emp3 = new Employee(4,"semed",commonAddress1);
//
//        emp.show();
//        emp1.show();
//        emp2.show();
//        emp3.show();


        ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");


        Employee emp =   context.getBean("e1111", Employee.class);
        emp.show();

//        Employee emp2 =   context.getBean("e111", Employee.class);
//        emp2.show();
//
//        Employee emp3 =   context.getBean("e222", Employee.class);
//        emp3.show();
    }
}
