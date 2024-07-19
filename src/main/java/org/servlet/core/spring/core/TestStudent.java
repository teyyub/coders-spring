package org.servlet.core.spring.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestStudent {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("StudentBean.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

        Student student=(Student)factory.getBean("studentObj");
        student.displayInfo();

        Student student1=factory.getBean("studentObj1", Student.class);
        student1.displayInfo();



//        Student student = new Student();
//        student.setName("semed");
//        student.displayInfo();
    }
}
