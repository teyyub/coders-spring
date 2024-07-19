package org.servlet.core.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

public class TestQuestion {
    public static void main(String[] args) {
//        List<String> answers = Arrays.asList("a","b","c");
//        Question q = new Question(1,"test",answers);
//        q.displayInfo();

        //singleton
        //prototype
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("QuestionBean.xml");
//        Question q1=context.getBean("q1", Question.class);
//        q1.displayInfo();

//        Question q2 = context.getBean("q2", Question.class);
//        q2.displayInfo();

        System.out.println(context.getBeanDefinitionCount());
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        context.close();

    }
}
