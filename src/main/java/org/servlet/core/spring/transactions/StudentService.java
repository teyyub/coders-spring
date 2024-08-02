package org.servlet.core.spring.transactions;

import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class StudentService {
    private final StudentRepository studentRepo;
    private final ContactRepository contactRepo;

    public StudentService(StudentRepository studentRepo, ContactRepository contactRepo) {
        this.studentRepo = studentRepo;
        this.contactRepo = contactRepo;
    }

    public void saveStudentWithContacts(Student student) {
        Connection connection = null;
        try {
            connection = DatabaseUtils.getConnection();
            connection.setAutoCommit(false); // Disable auto-commit

            // Save student
            studentRepo.saveStudent(connection, student);

            // Save contacts
            List<Contact> contacts = student.getContacts();
            for (Contact contact : contacts) {
                contact.setStudentId(student.getId());
                contactRepo.saveContact(connection, contact);
            }

            connection.commit(); // Commit transaction
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback(); // Rollback transaction in case of error
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        } finally {
            if (connection != null) {
                try {
                    connection.setAutoCommit(true); // Enable auto-commit
                    connection.close(); // Close connection
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}