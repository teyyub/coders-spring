package org.servlet.core.spring.transactions.item4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
@Repository
public class ContactRepository {
    @Autowired
    private JdbcTemplate template;
    public void saveContact(Contact contact) {
        String query = "INSERT INTO transactions.contact (student_id, phone) VALUES ( ?, ?)";
//        if(contact.getPhone().equals("987-654-3210")) throw new RuntimeException("invliad phone number");
        template.update(query, contact.getStudentId(),contact.getPhone());
    }
}
