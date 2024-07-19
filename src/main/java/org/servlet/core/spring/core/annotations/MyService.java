package org.servlet.core.spring.core.annotations;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    public void test(){
        System.out.println("this is my servcice ....");
    }
}
