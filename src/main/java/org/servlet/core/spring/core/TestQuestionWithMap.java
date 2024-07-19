package org.servlet.core.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestionWithMap {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("QuestionWithBean.xml");

        QuestionWithMap q1=context.getBean("q1", QuestionWithMap.class);
        q1.displayInfo();

    }
}
