package org.servlet.core.spring.transactions.item2;

import org.servlet.core.spring.transactions.refactored.trsc.TransactionCallback;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentServiceInTransaction implements TransactionCallback {
    private final StudentRepository studentRepo;
    private final ContactRepository contactRepo;
    private final Student student;

    public StudentServiceInTransaction(Student student , StudentRepository studentRepo, ContactRepository contactRepo) {
        this.student = student;
        this.studentRepo = studentRepo;
        this.contactRepo = contactRepo;
    }

    @Override
    public void doInTransaction(Connection connection) throws SQLException {
        try {
            studentRepo.saveStudent(connection, student); // Save student and retrieve generated ID
            for (Contact contact : student.getContacts()) {
                contact.setStudentId(student.getId()); // Set student ID
                contactRepo.saveContact(connection, contact); // Save contact
            }

        } catch (SQLException e) {
            throw e; // Rethrow exception to trigger outer rollback
        }
    }
}