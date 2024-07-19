package org.servlet.core.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestAddress {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("AddressBean.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Address a_1= factory.getBean("a1", Address.class);
        System.out.println(a_1);


        Address a_2= factory.getBean("a2", Address.class);
        System.out.println(a_2);

        //IOC
        Address a1 = new Address("a","b","c");
        System.out.println(a1);

        Address a2 = new Address();
        System.out.println(a2);


//        Student student = new Student();
//        student.setName("semed");
//        student.displayInfo();
    }
}
