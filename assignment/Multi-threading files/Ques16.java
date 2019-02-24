import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ques16{
    Lock lock= new ReentrantLock(true);
    Lock lock2= new ReentrantLock(true);

    public void method1(){
        lock.lock();
        System.out.println("method-1");
        lock2.lock();
        System.out.println("again method-1");
        lock2.unlock();
        lock.unlock();
    }

    public void method2(){
        lock2.lock();
        lock.lock();
        System.out.println("method-2");
        lock2.unlock();
        lock.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Ques16 obj= new Ques16();
        Thread thread1= new Thread(()->obj.method1());
        Thread thread2= new Thread(()->obj.method2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}