package org.servlet.core.spring.jdbc.aaa;

import java.time.LocalDateTime;

public class Student {

    // Class data members
    private Integer age;
    private String name;

    private Integer id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    // Constructor
    public Student() {}

    // Setters and Getters
    public void setAge(Integer age) { this.age = age; }
    public Integer getAge() { return age; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setId(Integer id) { this.id = id; }
    public Integer getId() { return id; }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
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
