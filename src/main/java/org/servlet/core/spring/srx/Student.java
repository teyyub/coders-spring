package org.servlet.core.spring.srx;

public class Student {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    //todo>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    private String name;
    private String age;

    public Student() {
        System.out.println("Double_Test");
    }

    public Student(String name, String age) {
        System.out.println("test12");
        this.name = name;
        this.age = age;
        System.out.println("++++");
    }


    public Student(String name ) {
        System.out.println("test22");
        this.name = name;

    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
