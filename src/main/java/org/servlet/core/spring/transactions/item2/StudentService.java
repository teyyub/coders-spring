package org.servlet.core.spring.transactions.item2;

import org.servlet.core.spring.transactions.refactored.DBConnection;
import org.servlet.core.spring.transactions.refactored.trsc.TransactionCallback;

import java.sql.Connection;
import java.sql.SQLException;

public class StudentService  {
    private final StudentRepository studentRepo;
    private final ContactRepository contactRepo;


    public StudentService( StudentRepository studentRepo, ContactRepository contactRepo) {
        this.studentRepo = studentRepo;
        this.contactRepo = contactRepo;
    }

    public void save(Student student){
        TransactionCallback transactionCallback = new StudentServiceInTransaction(student,studentRepo,contactRepo);
        DBConnection.executeTransaction(transactionCallback);
    }
}