package Ques6;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.io.IOException;

@Aspect
public class AspectQues6 {
    @AfterThrowing(pointcut = "this(ThrowingIOException)", throwing = "exception")
    void afterReturningAdvice(IOException exception) {
        System.out.println("Running AfterThrowing" + exception+"\n");
    }

}
