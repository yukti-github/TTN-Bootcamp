package Ques9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques9 {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring-config.xml");
        ServiceQ9 dummy1=applicationContext.getBean("myService4",ServiceQ9.class);
        dummy1.display();
        dummy1.servicesMethod();
        dummy1.servicesMethod2(3);
    }
}
