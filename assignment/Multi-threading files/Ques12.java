import java.util.concurrent.atomic.AtomicInteger;

public class Ques12 {

    AtomicInteger count= new AtomicInteger();

    public void increment()
    {
        synchronized (this)
        {
            count.incrementAndGet();
        }
    }

    public void method1(){
        for(int i=0;i<=1000;i++)
        {
            count.incrementAndGet();
        }
    }

    public void method2(){
        for(int i=0;i<=1000;i++)
        {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ques12 object = new Ques12();
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                object.method1();
                System.out.println("thread 1 executing");
            }
        });

        Thread thread2= new Thread(new Runnable() {
            @Override
            public void run() {
                object.method2();
                System.out.println("thread 2 executing");

            }
        });

        thread.start();
        thread2.start();
        thread.join();
        System.out.println("thread-1 joined");
        thread2.join();
        System.out.println("thread-2 joined");
        System.out.println(object.count);

    }
}
