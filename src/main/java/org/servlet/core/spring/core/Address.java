package org.servlet.core.spring.core;

public class Address {
    private String city;
    private String state;
    private String country;


    public Address() {
        System.out.println("ctor...");
    }

    public Address(String city, String state, String country) {
        super();
        System.out.println("address...");
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public String toString(){
        return city+" "+state+" "+country;
    }
}