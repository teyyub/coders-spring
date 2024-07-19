package org.servlet.core.spring.core.lifecycle;

public class Student {
    private String name;

    public Student(){
        System.out.println("ctor...");
    }

    public void init1(){
        System.out.println(
                "Bean Student has been "
                        + "instantiated and I'm "
                        + "the init() method");
    }

    public void destroy1() throws Exception
    {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method of student");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Hello: "+name);
    }
}
