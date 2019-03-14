package Ques7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques7 {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring-config.xml");
        ServiceQ7 dummy1=applicationContext.getBean(ServiceQ7.class);
        dummy1.display();
        dummy1.servicesMethod();
        dummy1.servicesMethod2(3);
    }
}
