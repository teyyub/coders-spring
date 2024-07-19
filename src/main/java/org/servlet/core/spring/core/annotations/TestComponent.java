package org.servlet.core.spring.core.annotations;

import org.servlet.core.spring.core.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestComponent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("org.servlet.core.spring.core.annotations");
        context.refresh();

//        ComponentDemo c = context.getBean(ComponentDemo.class);
//        c.demoFunction();
//
//        ComponentDemo c1 = context.getBean(ComponentDemo.class);
//        c1.demoFunction();
//
//        HelloDemo hd = context.getBean(HelloDemo.class);
//        hd.demoFunction();

//        MyService ms = context.getBean(MyService.class);
//        ms.test();
//
//        MyRepository mr = context.getBean(MyRepository.class);
//        mr.test();
//
        MyController mc = context.getBean(MyController.class);
        mc.test();

        MyController mc1 = context.getBean(MyController.class);
        mc1.test();

        context.close();
    }
}
