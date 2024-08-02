package org.servlet.core.spring.transactions.item4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
//        context.scan("org.servlet.core.spring.transactions.item4");
//        context.refresh();

        StudentService service = context.getBean(StudentService.class);

        List<Contact> contacts = new ArrayList<>();
               contacts.add(new Contact("123-456-7890"));
               contacts.add(new Contact("987-654-3210"));

        Student student = new Student("test", "john.doe@example.com", contacts);

        service.saveStudentWithContacts(student);
    }
}
