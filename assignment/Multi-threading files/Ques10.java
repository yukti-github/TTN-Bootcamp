
public class Ques10 {

    int count;

   synchronized public void increment()
    {
        count++;
    }

    public void method1(){
        for(int i=0;i<=1000;i++)
        {
            increment();
        }
    }

    public void method2(){
        for(int i=0;i<=1000;i++)
        {
            increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Ques10 object = new Ques10();
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
