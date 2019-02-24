// implementing runnable interface

public class Ques1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread running through implementing runnable interface");
    }
}

//extending thread class

 class thread1 extends Thread{
    public void run(){
        System.out.println("Thread running by extending thread class");
    }
}

class Main{
    public static void main(String[] args) {
        new thread1().start();
        new Thread(new Ques1()).start();
    }
}