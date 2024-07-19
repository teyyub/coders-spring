package org.servlet.core.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context
                = new ClassPathXmlApplicationContext(
                "JdbcBean.xml");

        // Get the bean studentDAO
        StudentDAO studentDAO = context.getBean("studentJDBC", StudentDAO.class);

        // Calling the method
        studentDAO.createTable();
        studentDAO.insert();
        studentDAO.selectAllRows();
//        studentDAO.update();
//        studentDAO.delete();
//        studentDAO.selectAllRows();
    }
}
