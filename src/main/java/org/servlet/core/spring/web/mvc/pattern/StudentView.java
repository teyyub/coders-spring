package org.servlet.core.spring.web.mvc.pattern;

public class StudentView {
    public void printStudentDetails(Student student) {
        System.out.println("Student:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
    }
}
