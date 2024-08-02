package org.servlet.core.spring.jpa;

import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public void flushAndSave(Student student){
        entityManager.persist(student);
        entityManager.flush();
    }

    public void insert(Student student){
        entityManager.setFlushMode(FlushModeType.COMMIT);
        System.out.println(entityManager.getFlushMode());
            entityManager.persist(student);
    }

    public Student studentById(Integer id){
        return entityManager.find(Student.class,id);
    }

    public List<Student> findAll(){
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    public Student update(Student student) {
        return entityManager.merge(student);
    }

    public void delete(Integer id) {
        Student student = studentById(id);
        if (student != null) {
            entityManager.remove(student);
        }
    }


}
