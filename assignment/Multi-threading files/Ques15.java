import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ques15 {
    Lock lock = new ReentrantLock(true);
    Condition condition= lock.newCondition();

    public void method1(){
        try {
            lock.lock();
            System.out.println("method- 1 started");
            condition.await();
            System.out.println("method-1 finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void method2(){
        try {
            lock.lock();
            System.out.println("method- 2 started");
            System.out.println("method-2 finished");
            //condition.signal();
            condition.signalAll();
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ques15 demo = new Ques15();
        Thread thread1 = new Thread(()->{   demo.method1();  });
        Thread thread2 = new Thread(()->{   demo.method2();  });

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}