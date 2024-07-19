package org.servlet.core.spring.srx;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class DemoApplication {

  // static  Student student1;
//   static Student student;


    public static void main(String[] args) {


        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println();


        ApplicationContext aplc = new ClassPathXmlApplicationContext("SrxBean.xml");

        Student student1 = (Student) aplc.getBean("student1");

        System.out.println(student1);
    }
}