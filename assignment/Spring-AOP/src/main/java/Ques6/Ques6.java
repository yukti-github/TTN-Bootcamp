package Ques6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Ques6 {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring-config.xml");
        ThrowingIOException dummy1=applicationContext.getBean(ThrowingIOException.class);
        try {
            dummy1.display();
        } catch (IOException e) {
        }
        try {
            dummy1.servicesMethod();
        } catch (IOException e) {
        }
        try {
            dummy1.servicesMethod2();
        } catch (IOException e) {
        }
    }
}
