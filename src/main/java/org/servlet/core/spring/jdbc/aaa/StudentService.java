package org.servlet.core.spring.jdbc.aaa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.logging.Logger;


@Service
public class StudentService {
 


    @Autowired
    StudentRepository repository;


    private static final Logger logger = Logger.getLogger(StudentService.class.getName());

    public void create(){
        repository.create();
    }


    public void insert(StudentRequest studentRequest){
        logger.info("insert student : " + studentRequest);

        Student save = toStudent(studentRequest,new Student());
        save.setCreatedAt(LocalDateTime.now());
        repository.insert(save);
    }


    public void update(StudentRequest studentRequest, Integer id){
        logger.info("insert student : " + studentRequest);
        Student student = repository.studentById(id);
        Student save = toStudent(studentRequest,student);
        save.setUpdatedAt(LocalDateTime.now());
//        repository.update(save);
    }

    public static Student toStudent(StudentRequest request, Student student){
        student.setAge(request.getAge());
        student.setName(request.getName());
        return  student;

    }


    public Student studentById(Integer id){
        return repository.studentById(id);
    }
}
