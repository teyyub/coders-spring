package org.servlet.core.spring.transactions.refactored;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String email;
    private List<Contact> contacts;

    // Constructors, getters, and setters
    public Student(int id, String name, String email, List<Contact> contacts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contacts = contacts;
    }

    public Student( String name, String email, List<Contact> contacts) {
        this.name = name;
        this.email = email;
        this.contacts = contacts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}