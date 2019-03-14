package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

public class Ques4 {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("Spring-config.xml");
        Services dummy1=applicationContext.getBean(Services.class);
        dummy1.display();
        dummy1.servicesMethod();
        dummy1.servicesMethod2();
    }
}

@Service
class Services{

    public void display(){
        System.out.println("Services class display method");
    }

    public void servicesMethod(){
        System.out.println("Services class second method");
    }

    public void servicesMethod2(){
        System.out.println("Services class third method");
    }
}

@Aspect
 class LoggingAspect {

    @Before("this(Services)")
    void beforeAdvice() {
        System.out.println("Before service is running");
    }

    @After("execution(* *(..))")
    void afterAdvice(){
        System.out.println("after service is running\n");
    }
}