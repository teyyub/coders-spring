package org.servlet.core.spring.transactions.item3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRepository extends BaseRepository<Student> {
    @Override
    public void save(Connection connection, Student entity) throws SQLException {
        String query = "INSERT INTO transactions.student (name, email) VALUES ( ?, ?) RETURNING id;" ;
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
//            stmt.setInt(1, student.getId());
            stmt.setString(1, entity.getName());
            stmt.setString(2, entity.getEmail());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                entity.setId(rs.getInt("id"));
            }
        }
    }
//    public void saveStudent(Connection connection, Student student) throws SQLException {
//        String query = "INSERT INTO transactions.student (name, email) VALUES ( ?, ?) RETURNING id;" ;
//        try (PreparedStatement stmt = connection.prepareStatement(query)) {
////            stmt.setInt(1, student.getId());
//            stmt.setString(1, student.getName());
//            stmt.setString(2, student.getEmail());
//            ResultSet rs = stmt.executeQuery();
//            if(rs.next()){
//                student.setId(rs.getInt("id"));
//            }
//        }
//    }
}
