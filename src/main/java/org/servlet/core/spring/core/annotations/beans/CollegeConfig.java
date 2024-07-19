package org.servlet.core.spring.core.annotations.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Annotation
@Configuration
// Class
public class CollegeConfig {
    @Bean(value = "bn")
    // Here the method name is the
    // bean id/bean name
//    @Bean
    public College collegeBean()
    {
        // Returns the College class object
        return new College("1","test");
    }

    @Bean
    // Here the method name is the
    // bean id/bean name
    public College collegeBean1()
    {
        // Returns the College class object
        return new College("2","test2");
    }
}

