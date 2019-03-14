package Ques9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectQ9 {

    @Before("execution(* *(..))")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("\nRunning before advice");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getSignature());
        System.out.println(joinPoint.getArgs());

    }

}