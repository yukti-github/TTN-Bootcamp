package Ques9;

import org.springframework.stereotype.Service;

@Service("myService4")
public class ServiceQ9 {
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
