package org.servlet.core.spring.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class TestJdbc {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringJdbcConfig.class);

        StudentJDBCTemp studentJDBCTemp = context.getBean(StudentJDBCTemp.class);

        //System.in
        Student st = new Student();
        st.setAge(12);
        st.setName("test");

        studentJDBCTemp.create();

        studentJDBCTemp.insert(st);

        System.out.println(studentJDBCTemp.studentNameById(1));
        System.out.println(studentJDBCTemp.studentById(1));
//        System.out.println(studentJDBCTemp.studentByIdNames(1));
        System.out.println("======");
//        String id = "1; drop table student; " ;
//        System.out.println(studentJDBCTemp.studentByIdDangerious(id));
        System.out.println("======");

        List<Student> students = studentJDBCTemp.listStudents();
        for (Student student : students) {
            System.out.println(student);
        }
        int count = studentJDBCTemp.countStudent();
        System.out.println(count);

        studentJDBCTemp.deleteStudents();
        System.out.println(studentJDBCTemp.countStudent());

//        System.out.println(studentJDBCTemp.studentNameById(1));
//        System.out.println(studentJDBCTemp.studentById(1));

        context.close();
    }
}
