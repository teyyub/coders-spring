package org.servlet.core.spring.jdbc.aaa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.scan("org.servlet.core.spring.jdbc.aaa");
        context.refresh();

        StudentService service = context.getBean(StudentService.class);
        service.create();


        Student s = new Student();
        s.setName("test");
        s.setAge(12);


//        service.insert(s);

        System.out.println(service.studentById(1));
    }
}
