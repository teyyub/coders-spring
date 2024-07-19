package org.servlet.core.spring.core.annotations.item1;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Hello h = new Hello();
        try {
            Method  m= h.getClass().getMethod("sayHello");
            MyAnnotation ma = m.getAnnotation(MyAnnotation.class);
            System.out.println(ma.value());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
