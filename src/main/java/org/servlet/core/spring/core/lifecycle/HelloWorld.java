package org.servlet.core.spring.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {

    public HelloWorld(){
        System.out.println("hello world ctor....");
    }

    @Override
    // It is the init() method
    // of our bean and it gets
    // invoked on bean instantiation
    public void afterPropertiesSet()
            throws Exception
    {
        System.out.println(
                "Bean HelloWorld has been "
                        + "instantiated and I'm the "
                        + "init() method");
    }

    @Override
    // This method is invoked
    // just after the container
    // is closed
    public void destroy() throws Exception
    {
        System.out.println(
                "Container has been closed "
                        + "and I'm the destroy() method");
    }
}
