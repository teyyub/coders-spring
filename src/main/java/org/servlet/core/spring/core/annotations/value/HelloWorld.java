package org.servlet.core.spring.core.annotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {


//    @Value("${greeting}")
    @Value("salam")
   private String greeting;


    public void printGreeting() {
        System.out.println(greeting);
    }
}
