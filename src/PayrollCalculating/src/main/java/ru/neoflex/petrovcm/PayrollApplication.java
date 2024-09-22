package ru.neoflex.petrovcm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PayrollApplication 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext annotationConfContext = 
            new AnnotationConfigApplicationContext(ApplicationConfig.class);
        SpringApplication.run(PayrollApplication.class, args);
    }
}
