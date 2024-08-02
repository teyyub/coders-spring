package org.servlet.core.spring.transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRepository {
    public void saveStudent(Connection connection, Student student) throws SQLException {
        String query = "INSERT INTO transactions.student (name, email) VALUES ( ?, ?) RETURNING id;" ;
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
//            stmt.setInt(1, student.getId());
            stmt.setString(1, student.getName());
            stmt.setString(2, student.getEmail());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                student.setId(rs.getInt("id"));
            }
        }
    }
}
