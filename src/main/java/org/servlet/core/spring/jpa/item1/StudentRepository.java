package org.servlet.core.spring.jpa.item1;

import org.servlet.core.spring.jpa.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Repository
public class StudentRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres_db1");
    private EntityManager entityManager = emf.createEntityManager();


    public void flushAndSave(Student student){
        entityManager.getTransaction().begin();
        entityManager.persist(student);
        System.out.println("After persist, ID: " + student.getId());
        entityManager.flush();
        System.out.println("After flush, ID: " + student.getId());
        entityManager.getTransaction().commit();
    }

    public void insert(Student student){
         entityManager.getTransaction().begin();
         entityManager.persist(student);
         entityManager.getTransaction().commit();
    }




    public Student studentById(Integer id){
        return entityManager.find(Student.class, id);
    }



    public List<Student> findAll(){
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    public Student update(Student student) {
        entityManager.getTransaction().begin();
         entityManager.merge(student);
        entityManager.getTransaction().commit();
        return  student;
    }

    public void delete(Integer id) {
        Student student = studentById(id);
        System.out.println(student);
        if (student != null) {
         entityManager.getTransaction().begin();
            entityManager.remove(student);
         entityManager.getTransaction().commit();
        }
    }


}
