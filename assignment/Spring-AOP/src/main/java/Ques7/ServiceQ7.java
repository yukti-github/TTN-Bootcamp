package Ques7;

import org.springframework.stereotype.Service;

@Service("myService2")
public class ServiceQ7 {
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
