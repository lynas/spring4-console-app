package com.lynas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.lynas")
@PropertySource("application.properties")
public class ApplicationRoot {

    @Autowired
    private SampleService service;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationRoot.class);
        ApplicationRoot app = context.getBean(ApplicationRoot.class);
        app.service.printDemo();
    }
}
