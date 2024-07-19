package org.servlet.core.spring.core;

import org.servlet.core.spring.core.spel.Training;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpel {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("SpelBean.xml");

        Training t= context.getBean("training", Training.class);
        System.out.println(t.getTopic());
        System.out.println(t.getDefaultTopic());
    }

}
