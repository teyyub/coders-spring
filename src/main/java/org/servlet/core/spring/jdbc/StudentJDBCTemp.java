package org.servlet.core.spring.jdbc;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentJDBCTemp  {

    private JdbcTemplate jdbcTemplate;

    // Method 1
    public void setDataSource(DataSource dataSource)
    {
        // This keyword refers to current instance itself
        // Class data members
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }



    public void create(){
        String sql  = "CREATE TABLE IF NOT EXISTS student (\n" +
                "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "    name VARCHAR(100) NOT NULL,\n" +
                "    age INT NOT NULL\n" +
                ");";
        this.jdbcTemplate.execute(sql);
    }

    public void insert(Student student){
        this.jdbcTemplate.update(
                "insert into student ( name,age) values (?, ?)",
                student.getName(), student.getAge());
    }

    public String studentNameById(Integer id){
        String lastName = this.jdbcTemplate.queryForObject(
                "select name from student where id = ?",
                new Object[]{id}, String.class);
        return lastName;
    }

    public Student studentById(Integer id){
        Student s = this.jdbcTemplate.queryForObject(
                "select id, name, age from student where id = ?",
                new Object[]{id}, mapper);
        return s;
    }

//    public Student studentByIdNames(Integer id){
//        String sql ="select id, name, age from student where id = :_id";
//        SqlParameterSource namedParameters = new MapSqlParameterSource("_id", id);
//
//        Student s = this.jdbcTemplate.queryForObject(sql, new SqlParameterSource[]{namedParameters}, mapper);
//        return s;
//    }

    public Student studentByIdDangerious(String id){
        String sql ="select id, name, age from student where id = " + id;

        Student s = this.jdbcTemplate.queryForObject(sql,mapper);
        return s;
    }

    // Method 2
    public List<Student> listStudents() {

        // Custom SQL query
        String SQL = "select * from student ";
//        List<Student> students = new ArrayList<>();
        // extractData() is ResultSetExtractor
// interface's method
//        return jdbcTemplate.query(SQL, rs -> {
////                List<Student> studentDetailList = new ArrayList<Student>();
//            while(rs.next()) {
//                Student student = new Student();
//                // 1, 2 and 3 are the indices of the data present
//                // in the database respectively
//                student.setId(rs.getInt(1));
//                student.setName(rs.getString(2));
//                students.add(student);
//            }
//            return students;
//        });
        return jdbcTemplate.query(SQL, mapper);
    }

    public void deleteStudents() {
        this.jdbcTemplate.update("delete from student");
    }

    int countStudent(){
        return
                this.jdbcTemplate.queryForObject("select count(*) from student",  Integer.class);
    }

    RowMapper<Student> mapper = new RowMapper<Student>() {
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student s = new Student();
            s.setId(rs.getInt(1));
            s.setName(rs.getString(2));
            s.setAge(rs.getInt(3));
            return s;
        }
    };
}
