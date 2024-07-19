package org.servlet.core.spring.core;

public class Student {

    private String name;



    public Student (){
        System.out.println("ctor...");
    }

    public void init(){
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm "
                        + "the init() method");
    }

    public void destroy() throws Exception
    {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
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
