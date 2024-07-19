package org.servlet.core.spring.core;

import org.springframework.beans.factory.annotation.Autowired;


//wire
public class Employee {
    private int id;
    private String name ;
    //depend on address


    private Address address;//Aggregation



    public Employee() {
        System.out.println("def cons");}

    public Employee(int id) {this.id = id;}

    public Employee(String name) {  this.name = name;}


//    public Employee(int id, String name) {
//        super();
//        this.id = id;
//        this.name = name;
//        this.address = new Address("a","b","c");
//    }
//

//    loose coupling

    public Employee(int id, String name, Address address) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    void show(){
        System.out.println(id+" "+name);
        System.out.println("address-> "+address);
    }

}
