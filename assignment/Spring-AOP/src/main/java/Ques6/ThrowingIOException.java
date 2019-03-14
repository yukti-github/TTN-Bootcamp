package Ques6;

import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ThrowingIOException {
    public void display() throws IOException {
        System.out.println("METHOD- 1");
        throw new IOException();
    }

    public void servicesMethod() throws IOException{
        System.out.println("METHOD-2");
        throw new IOException();
    }

    public void servicesMethod2() throws IOException{
        System.out.println("METHOD-3");
        throw new IOException();
    }
    }
