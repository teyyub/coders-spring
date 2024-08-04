package org.servlet.core.spring.jpa.item1;

import org.servlet.core.spring.jpa.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Repository
public class StudentRepository {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("postgres_db1");
    private EntityManager entityManager = emf.createEntityManager();
    PersistenceUtil util = Persistence.getPersistenceUtil();

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

//         System.out.println(entityManager.isOpen());
//        entityManager.close();
//         System.out.println("==");
//        System.out.println(entityManager.isOpen());
//         System.out.println(util.isLoaded(student));
//         entityManager.remove(student);
//         System.out.println(util.isLoaded(student));
//        boolean isManaged = entityManager.contains(student);
//        System.out.println("Is entity managed? " + isManaged);
//
//        // Detach the entity
//        entityManager.detach(student);
//        System.out.println("After detaching: " + student);
//
//        boolean isManaged1 = entityManager.contains(student);
//        System.out.println("Is entity managed? " + isManaged1);
//
//        // Reattach the entity and refresh
//        entityManager.merge(student);
////        entityManager.refresh(student);
//        System.out.println("After merging and refreshing: " + student);
//
//        boolean isManaged2 = entityManager.contains(student);
//        System.out.println("Is entity managed? " + isManaged2);
         entityManager.getTransaction().commit();
//         entityManager.clear();
//        entityManager.detach(student);
//         System.out.println(entityManager.contains(student));
    }




    public Student studentById(Integer id){
//        entityManager.clear();
//        Student s  = entityManager.find(Student.class, id);

        Student s1  = entityManager.find(Student.class, id);
        return s1;
    }



    public List<Student> findAll(){
        return entityManager.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

    public Student update(Student student) {
        entityManager.getTransaction().begin();

         entityManager.merge(student);
         student.setName("test1");


         entityManager.merge(student);

        entityManager.getTransaction().commit();
        return  student;
    }

    public void deleteAll(){
        entityManager.getTransaction().begin();
        for ( Student student :findAll() ){
               entityManager.contains(student);
               entityManager.remove(student);
//               entityManager.clear();
        }
        entityManager.getTransaction().commit();
    }

    public void deleteById(Integer id) {
        Student student = studentById(id);
        System.out.println(student);
        if (student != null) {
            entityManager.getTransaction().begin();
            entityManager.remove(student);
            entityManager.getTransaction().commit();
//    }
        }
    }
        public void delete (Student student){
//        Student student = studentById(id);
//        System.out.println(student);
//        if (student != null) {
         entityManager.getTransaction().begin();
            entityManager.remove(student);
         entityManager.getTransaction().commit();

        }


}
