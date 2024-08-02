package org.servlet.core.spring.jdbc.aaa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class TestProfile {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//        context.scan("org.servlet.core.spring.jdbc.aaa");
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("dev"); // Set active profile
        context.register(ProfileConfig.class);


        context.scan("org.servlet.core.spring.jdbc.aaa");
        context.refresh();
        StudentService service = context.getBean(StudentService.class);

        service.create();
        Student s = new Student();
        s.setName("test11111");
        s.setAge(34);
//        service.insert(s);
        System.out.println(service.studentById(1));

    }
}
