package Ques8;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectQ8 {

    @Before("displayPointcut() || secondPointcut()")
    void beforeAdvice() {
        System.out.println("Running before display or second- Point Cut");
    }

    @Pointcut("execution(void display())")
    void displayPointcut(){
    }

    @Pointcut("execution(void servicesMethod())")
    void secondPointcut(){
    }

}