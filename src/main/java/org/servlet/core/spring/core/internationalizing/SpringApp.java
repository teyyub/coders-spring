package org.servlet.core.spring.core.internationalizing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class SpringApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GreetingService greetingService = context.getBean(GreetingService.class);

        // Print greeting messages for different locales
        System.out.println("Default: " + greetingService.getGreeting(Locale.getDefault()));
        System.out.println("French: " + greetingService.getGreeting(Locale.FRENCH));
        System.out.println("German: " + greetingService.getGreeting(Locale.GERMAN));
    }
}