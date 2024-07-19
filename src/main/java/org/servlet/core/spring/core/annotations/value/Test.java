package org.servlet.core.spring.core.annotations.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        context.scan("org.servlet.core.spring.core.annotations");
//        context.refresh();
        HelloWorld hw = context.getBean(HelloWorld.class);
        hw.printGreeting();
    }
}
