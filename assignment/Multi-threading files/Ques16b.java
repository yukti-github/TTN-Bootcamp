import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ques16b{
    Lock lock= new ReentrantLock(true);
    Lock lock2= new ReentrantLock(true);

    public void acquireLock(Lock lock1, Lock lock2){

        boolean acquireLock1= lock1.tryLock();
        boolean acquireLock2= lock2.tryLock();

        if(acquireLock1 && acquireLock2){
            return;
        }

        if(acquireLock1){
            lock1.unlock();
        }

        if(acquireLock2){
            lock2.unlock();
        }

    }

    public void method1(){
        acquireLock(lock,lock2);
        System.out.println("method-1");
        System.out.println("again method-1");
        lock2.unlock();
        lock.unlock();
    }

    public void method2(){
        acquireLock(lock2,lock);
        System.out.println("method-2");
        System.out.println("second lock method-2");
        lock.unlock();
        lock2.unlock();
    }

    public static void main(String[] args) throws InterruptedException {
        Ques16b obj= new Ques16b();
        Thread thread1= new Thread(()->obj.method1());
        Thread thread2= new Thread(()->obj.method2());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}