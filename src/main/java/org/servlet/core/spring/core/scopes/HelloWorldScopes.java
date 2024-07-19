package org.servlet.core.spring.core.scopes;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class HelloWorldScopes {
    public String name;
    // Create a setter method to
    // set the value passed by user
    public void setName(String name)
    {
        this.name = name;
    }

    // Create a getter method so that
    // the user can get the set value
    public String getName()
    {
        return name;
    }
}
