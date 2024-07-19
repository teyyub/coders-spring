package org.servlet.core.spring.core.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext
                ap
                = new ClassPathXmlApplicationContext(
                "ScopesBean.xml");


        HelloWorldScopes hwc = ap.getBean("hwc", HelloWorldScopes.class);
        System.out.println(hwc.getName()); //semed

        System.out.println("==============");

        hwc.setName("test");
        System.out.println(hwc.getName()); //test

        HelloWorldScopes hwc1 = ap.getBean("hwc", HelloWorldScopes.class);
        System.out.println(hwc1.getName()); // semed?

//        hwc  = new HelloWorldScopes();
//        hwc.setName("semed");
//        hwc.setName("test");



    }
}
