package Ques8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ques8 {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring-config.xml");
        ServiceQ8 dummy1=applicationContext.getBean("myService3",ServiceQ8.class);
        dummy1.display();
        dummy1.servicesMethod();
        dummy1.servicesMethod2(3);
    }
}
