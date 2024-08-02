package org.servlet.core.spring.transactions.refactored;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentRepository studentRepo = new StudentRepository();
        ContactRepository contactRepo = new ContactRepository();
        StudentService studentService = new StudentService(studentRepo, contactRepo);

        List<Contact> contacts = new ArrayList<>();
               contacts.add(new Contact("123-456-7890"));
               contacts.add(new Contact("987-654-3210"));

        Student student = new Student("John Doe", "john.doe@example.com", contacts);

        studentService.saveStudentWithContacts(student);
    }
}
