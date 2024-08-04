package org.servlet.core.spring.jpa.item1;


import org.servlet.core.spring.jpa.Contact;
import org.servlet.core.spring.jpa.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
    private static final String ALPHANUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
    private static final int STRING_LENGTH = 12; // Adjust the length as needed

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.servlet.core.spring.jpa.item1");
        context.refresh();
        StudentService studentService = context.getBean(StudentService.class);

        Student student = getStudent();

        Contact c1 = new Contact();
        c1.setTel("1234");

        Contact c2 = new Contact();
        c2.setTel("4524");

        student.setContacts(Arrays.asList(c1,c2));
//        studentService.deleteAll();
//        studentService.flushAndSave(student);
//        studentService.studentById(student.getId());
//        studentService.insert(student);
//        Student retrieve = studentService.studentById(1);
        Student retrieve = studentService.studentById(4);
        System.out.println("1.>"+retrieve);
//        Student retrieve1 = studentService.studentById(student.getId());

//        System.out.println("1111 "+retrieve.getContacts().get(0).getTel());
//        System.out.println(retrieve.getAge());

//        studentService.delete(retrieve);

//        Student retrieve2 = studentService.studentById(student.getId());
//        System.out.println("2.>"+retrieve2);
//        retrieve.setAge(18);

//        retrieve.setName("test");
//        studentService.update(retrieve);
//        System.out.println(retrieve);

//        studentService.deleteAll();
    }

    static Student getStudent(){
        Student s = new Student();
        s.setName(generateRandomString(5));
        s.setAge(new Random(5).nextInt(2));
        return s;
    }

    public static String generateRandomString(int length) {
        SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALPHANUMERIC_STRING.length());
            sb.append(ALPHANUMERIC_STRING.charAt(index));
        }
        return sb.toString();
    }
}

