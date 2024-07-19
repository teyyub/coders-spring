package org.servlet.core.spring.core.annotations;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
//@Lazy
//@Scope("prototype")
// Class
public class ComponentDemo {
    public ComponentDemo() {
        System.out.println("ComponentDemo Constructor: Bean is being created.");
    }

    // Method
    public void demoFunction()
    {
        // Print statement when method is called
        System.out.println("Hello GeeksForGeeks");
    }
}
