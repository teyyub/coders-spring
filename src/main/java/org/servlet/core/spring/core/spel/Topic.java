package org.servlet.core.spring.core.spel;

public class Topic {

    // Class data members
    private String name;

    // Constructor: Default
    public Topic() {}

    // Constructor: Parameterized
    public Topic(String name) { this.name = name; }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String toString() { return name; }
}
