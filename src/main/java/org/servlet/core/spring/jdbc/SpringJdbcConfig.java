package org.servlet.core.spring.jdbc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan("org.servlet.core.spring.jdbc")
public class SpringJdbcConfig {

    @Bean
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl( "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1");
        dataSource.setUsername("sa");
        dataSource.setPassword("sa");

        return dataSource;
    }

    @Bean
    public DataSource dataSourcePg()
    {
        DriverManagerDataSource dataSource
                = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl( "jdbc:postgresql://localhost:54321/dvdrental");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres");
        return dataSource;
    }
    @Bean
    public StudentJDBCTemp studentJDBCTemp() {
        StudentJDBCTemp studentJDBCTemp = new StudentJDBCTemp();
        studentJDBCTemp.setDataSource(dataSource());
        return studentJDBCTemp;
    }

//    @Bean
//    public StudentJDBCTemp postgresqlTemplate() {
//        StudentJDBCTemp studentJDBCTemp = new StudentJDBCTemp();
//        studentJDBCTemp.setDataSource(dataSourcePg());
//        return studentJDBCTemp;
//    }
}
