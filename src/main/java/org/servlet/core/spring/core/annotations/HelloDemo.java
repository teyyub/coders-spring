package org.servlet.core.spring.core.annotations;

import org.springframework.stereotype.Component;


@Component
public class HelloDemo {
    public HelloDemo() {
        System.out.println("HelloDemo Constructor: Bean is being created.");
    }

    // Method
    public void demoFunction()
    {
        // Print statement when method is called
        System.out.println("Hello");
    }
}
