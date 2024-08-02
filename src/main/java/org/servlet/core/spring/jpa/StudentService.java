package org.servlet.core.spring.jpa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;


@Service
public class StudentService {


    @Autowired
    StudentRepository repository;


    private static final Logger logger = Logger.getLogger(StudentService.class.getName());


    @Transactional
    public void flushAndSave(Student student){
        logger.info("insert student : " + student);
        repository.flushAndSave(student);
        logger.info("id: "+student.getId());
    }

    @Transactional
    public void insert(Student student){
        logger.info("insert student : " + student);
        repository.insert(student);
        logger.info("id: "+student.getId());
        student.setName("test123456");
        logger.info("insert student : " + student);
    }


    @Transactional
    public Student studentById(Integer id){
        Student s1 = repository.studentById(id);
        Student s2 = repository.studentById(id);
        return s2;
    }
}
