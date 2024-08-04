package org.servlet.core.spring.jpa;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student" )
public class Student {

    // Class data members
//    @Basic(fetch=FetchType.LAZY)
    private Integer age;
    @Column(name= "names", unique = true)
    public String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

//
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="student_id")
    List<Contact> contacts;

    // Setters and Getters
    public void setAge(Integer age) { this.age = age; }
    public Integer getAge() { return age; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setId(Integer id) { this.id = id; }
    public Integer getId() { return id; }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
