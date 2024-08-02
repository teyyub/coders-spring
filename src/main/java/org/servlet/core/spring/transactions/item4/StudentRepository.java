package org.servlet.core.spring.transactions.item4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.Objects;

@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate template;
    public void saveStudent(Student student)  {
        String query = "INSERT INTO transactions.student (name, email) VALUES ( ?, ?) returning id " ;
        KeyHolder keyHolder = new GeneratedKeyHolder();
        template.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            return ps;
        }, keyHolder);
        student.setId(Objects.requireNonNull(keyHolder.getKey()).intValue());
    }
}
