package org.servlet.core.spring.jpa.item1;


import org.servlet.core.spring.jpa.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Persistence;
import javax.persistence.PersistenceUtil;
import java.util.logging.Logger;


@Service
public class StudentService {


    @Autowired
    StudentRepository repository;


    private static final Logger logger = Logger.getLogger(StudentService.class.getName());



    public void flushAndSave(Student student){
//        logger.info("insert student : " + student);
        repository.flushAndSave(student);
//       Student s = repository.studentById(student.getId());
        System.out.println(">>>>>" + student);
    }


    public void insert(Student student){
        logger.info("insert student : " + student);
        repository.insert(student);

        logger.info("id: "+student.getId());
//        student.setName("test123456");
//        logger.info("insert student : " + student);
    }

    public void update(Student student){
//        logger.info("insert student : " + student);
        repository.update(student);
//        logger.info("id: "+student.getId());
//        student.setName("test123456");
//        logger.info("insert student : " + student);
    }


//    @Transactional
//    public Student studentById(Integer id){
//        Student s1 = repository.studentById(id);
//        Student s2 = repository.studentById(id);
//        return s2;
//    }


    public Student studentById(Integer id){
        return  repository.studentById(id);
    }

    public void deleteById(Integer id){
        repository.deleteById(id);
    }


    public void delete(Student student){
        repository.delete(student);
    }

    public void deleteAll(){
        repository.deleteAll();
    }



}
