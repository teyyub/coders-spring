package org.servlet.core.spring.jpa.item1;


import org.servlet.core.spring.jpa.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.servlet.core.spring.jpa.item1");
        context.refresh();
        StudentService studentService = context.getBean(StudentService.class);

        Student student =new Student();
        student.setName("aaaa11");
        student.setAge(12);
//        studentService.flushAndSave(student);
//        studentService.studentById(student.getId());
        studentService.insert(student);
        Student retrieve = studentService.studentById(1);
        System.out.println(retrieve);

//        studentService.deleteById(1);

        retrieve.setAge(18);
        studentService.update(retrieve);

    }
}

