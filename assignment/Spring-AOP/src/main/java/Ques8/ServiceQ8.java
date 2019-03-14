package Ques8;

import org.springframework.stereotype.Service;

@Service("myService3")
public class ServiceQ8 {
    public void display(){
        System.out.println("Services class display method");
    }

    public void servicesMethod(){
        System.out.println("Services class second method");
    }

    public void servicesMethod2(int n){
        System.out.println("Services class third method "+n);
    }
}
