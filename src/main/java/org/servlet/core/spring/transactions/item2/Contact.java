package org.servlet.core.spring.transactions.item2;

public class Contact {
    private int id;
    private int studentId;
    private String phone;

    // Constructors, getters, and setters
    public Contact(int id, int studentId, String phone) {
        this.id = id;
        this.studentId = studentId;
        this.phone = phone;
    }

    public Contact( int studentId, String phone) {
        this.studentId = studentId;
        this.phone = phone;
    }

    public Contact(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
