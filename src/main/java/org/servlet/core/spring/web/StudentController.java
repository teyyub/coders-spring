package org.servlet.core.spring.web;

import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private List<Student> students = new ArrayList<>();
    private StudentView view = new StudentView();

    public void run() {
        while (true) {
            int choice = view.getMainMenuChoice();

            switch (choice) {
                case 1:
                    Student student = view.getStudentDetails();
                    addStudent(student);
                    break;
                case 2:
                    view.displayStudents(students);
                    break;
                case 3:
                    System.exit(0);
                default:
                    view.displayInvalidChoice();
            }
        }
    }

    private void addStudent(Student student) {
        students.add(student);
    }

    public static void main(String[] args) {
        StudentController controller = new StudentController();
        controller.run();
    }
}