package org.servlet.core.spring.core.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentAppContext {
    public static void main(String[] args) {
//        Resource resource=new ClassPathResource("Bean.xml");
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("LifeCycleBean.xml");

//        Student student=context.getBean("studentObj11", Student.class);
//        student.displayInfo();

       // HelloWorld hw = context.getBean("hw",HelloWorld.class);
        context.close();
    }
}
