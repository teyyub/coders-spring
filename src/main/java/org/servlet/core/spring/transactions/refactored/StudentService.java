package org.servlet.core.spring.transactions.refactored;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.List;

public class StudentService {
    private final StudentRepository studentRepo;
    private final ContactRepository contactRepo;

    public StudentService(StudentRepository studentRepo, ContactRepository contactRepo) {
        this.studentRepo = studentRepo;
        this.contactRepo = contactRepo;
    }

    public void saveStudentWithContacts(Student student) {
        DBConnection.executeTransaction(connection -> {
//            Savepoint savepoint1 = null;
            try {
                studentRepo.saveStudent(connection, student); // Save student and retrieve generated ID
//                savepoint1 = connection.setSavepoint("Savepoint1");
                for (Contact contact : student.getContacts()) {
                    contact.setStudentId(student.getId()); // Set student ID
                    contactRepo.saveContact(connection, contact); // Save contact
                }
            } catch (SQLException e) {
//                if (savepoint1 != null) {
//                    connection.rollback(savepoint1); // Rollback to savepoint if error occurs
//                }
                throw e; // Rethrow exception to trigger outer rollback
            }
        });
    }
}