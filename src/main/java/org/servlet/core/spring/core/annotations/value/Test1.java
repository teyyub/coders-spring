package org.servlet.core.spring.core.annotations.value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext(
                "/value/ValueBean.xml");

        HelloWorld hw = context.getBean(HelloWorld.class);
        hw.printGreeting();
    }
}
