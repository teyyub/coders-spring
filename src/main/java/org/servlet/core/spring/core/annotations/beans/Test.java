package org.servlet.core.spring.core.annotations.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(CollegeConfig.class);

        // Getting the bean
        College college
                = context.getBean("bn", College.class);
//
//        // Invoking the method
//        // inside main() method
        college.test();

        College college1
                = context.getBean("collegeBean1", College.class);
//
//        // Invoking the method
//        // inside main() method
        college1.test();
    }
}
