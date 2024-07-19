package org.servlet.core.spring.core.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope(value = "prototype")
public class MyController {

//    @Autowired
//    MyService myService ;
//
//    public MyController(MyService myService) {
//        this.myService = myService;
//    }

    public MyController(){
        System.out.println("ctor....");
    }
    public void test(){
        System.out.println("my controller ....");
    }
}
