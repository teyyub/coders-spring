package org.servlet.core.spring.transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContactRepository {
    public void saveContact(Connection connection, Contact contact) throws SQLException {
        String query = "INSERT INTO transactions.contact (student_id, phone) VALUES ( ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
//            if(contact.getPhone().equals("987-654-3210"))
//                throw new SQLException("because of invalid phone number");
//            stmt.setInt(1, contact.getId());
            stmt.setInt(1, contact.getStudentId());
            stmt.setString(2, contact.getPhone());
            stmt.executeUpdate();
        }
    }
}
