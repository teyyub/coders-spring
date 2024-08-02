package org.servlet.core.spring.jpa;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentService studentService = context.getBean(StudentService.class);

        Student student =new Student();
        student.setName("aaaa");
        student.setAge(112);
//        studentService.flushAndSave(student);
        studentService.insert(student);
//        System.out.println(studentService.studentById(1));
//        System.out.println(studentService.studentById(1));
//        studentService.add(new Student("Robert", 20000, "Senior Manager"));
//        studentService.add(new Student("Anil", 5000, "Software Engineer"));

        // Get Persons
//        List<Student> students = studentService.studentById;
//        for (Student Student : Students) {
//            System.out.println("Id : "+Student.getId());
//            System.out.println("Name : "+Student.getName());
//            System.out.println("Salary = "+Student.getSalary());
//            System.out.println("Designation = "+Student.getDesignation());
//            System.out.println();
//        }
        context.close();
    }
}