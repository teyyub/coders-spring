package org.servlet.core.spring.transactions.item4;

import org.servlet.core.spring.transactions.refactored.DBConnection;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

@Service
public class StudentService {
    private final StudentRepository studentRepo;
    private final ContactRepository contactRepo;

    public StudentService(StudentRepository studentRepo, ContactRepository contactRepo) {
        this.studentRepo = studentRepo;
        this.contactRepo = contactRepo;
    }

    @Transactional
    public void saveStudentWithContacts(Student student) {
        studentRepo.saveStudent(student);
        for(Contact contact: student.getContacts()){
            contact.setStudentId(student.getId());
            contactRepo.saveContact(contact);
        }
    }
}