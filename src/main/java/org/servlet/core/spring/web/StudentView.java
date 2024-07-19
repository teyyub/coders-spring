package org.servlet.core.spring.web;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private Scanner scanner = new Scanner(System.in);

    public int getMainMenuChoice() {
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        return scanner.nextInt();
    }

    public Student getStudentDetails() {
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        return new Student(id, name);
    }

    public void displayStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println("ID: " + student.getId() + ", Name: " + student.getName());
            }
        }
    }

    public void displayInvalidChoice() {
        System.out.println("Invalid choice. Please try again.");
    }
}
