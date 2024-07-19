package org.servlet.core.spring.core.annotations.beans;

import org.springframework.stereotype.Component;

// Class
//POJO
//@Entity
public class College {

    private String id;
    private String name;

    public College(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method
    public void test()
    {
        // Print statement
        System.out.println("Test College Method");
    }
}
