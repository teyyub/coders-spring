package org.servlet.core.spring.jdbc;

import java.sql.*;

public class StudentDAO {

    // Class data members
    private String driver;
    private String url ;
    private String userName;
    private String password;

    // Setter methods for
    // Setter Injection
    public void setDriver(String driver)
    {
        this.driver = driver;
    }

    // Setter
    public void setUrl(String url) { this.url = url; }

    // Setter
    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    // Setter
    public void setPassword(String password)
    {
        this.password = password;
    }

    public void createTable()  throws ClassNotFoundException, SQLException
    {
        // Load driver
//        Class.forName(driver);

        // Getting a connection
        Connection con = DriverManager.getConnection(url, userName, password);

        // Execute query
        Statement stmt = con.createStatement();

      boolean result = stmt.execute("CREATE TABLE IF NOT EXISTS student (\n" +
              "    id INT AUTO_INCREMENT PRIMARY KEY,\n" +
              "    name VARCHAR(100) NOT NULL,\n" +
              "    age INT NOT NULL\n" +
              ");");
        System.out.println(result);
      // Closing the connection
        con.close();
    }


    public void insert()
            throws ClassNotFoundException, SQLException
    {
        System.out.println("inserting student data..");

        // Load driver
//        Class.forName(driver);

        // Getting a connection
        Connection con = DriverManager.getConnection(
                url, userName, password);

        // Execute query
        Statement stmt = con.createStatement();

        stmt.executeUpdate("insert into student(id,name,age) values(1,'test',10)");


        // Closing the connection
        con.close();
    }

    public void update()
            throws ClassNotFoundException, SQLException
    {
        System.out.println("update student data..");

        // Load driver
//        Class.forName(driver);

        // Getting a connection
        Connection con = DriverManager.getConnection(
                url, userName, password);

        // Execute query
        Statement stmt = con.createStatement();

        stmt.executeUpdate("update student set name='test1', age = 20 where id = 1");


        // Closing the connection
        con.close();
    }

    public void delete()
            throws ClassNotFoundException, SQLException
    {
        System.out.println("update student data..");

        // Load driver
        Class.forName(driver);

        // Getting a connection
        Connection con = DriverManager.getConnection(
                url, userName, password);

        // Execute query
        Statement stmt = con.createStatement();

        stmt.executeUpdate("delete  from student  where id = 1");


        // Closing the connection
        con.close();
    }

    // Setter
    public void selectAllRows()
            throws ClassNotFoundException, SQLException
    {
        System.out.println("Retrieving all student data..");

        // Load driver
//        Class.forName(driver);
        String SQL = "SELECT * FROM  student";
        // Getting a connection
        Connection con = DriverManager.getConnection(
                url, userName, password);

        // Execute query
        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery(SQL);

        while (rs.next()) {


            System.out.println(rs.getInt(1) + " "
                    + rs.getString(2)
                    + " " + rs.getInt(3) + " "
                    );
        }

        // Closing the connection
        con.close();
    }



}
