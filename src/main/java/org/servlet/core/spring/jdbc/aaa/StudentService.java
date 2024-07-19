package org.servlet.core.spring.jdbc.aaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class StudentService {


    @Autowired
    StudentRepository repository;


    private static final Logger logger = Logger.getLogger(StudentService.class.getName());

    public void create(){
        repository.create();
    }
    public void insert(Student student){
        logger.info("insert student : " + student);
        repository.insert(student);
    }

    public Student studentById(Integer id){
        return repository.studentById(id);
    }
}
