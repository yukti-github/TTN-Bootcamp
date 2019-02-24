public class Ques14 {

    public void thread1(){
        synchronized (this) {
            System.out.println("Thread 1 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 Done");
        }
    }

    public void thread2(){
        synchronized (this) {
            System.out.println("Thread 2 Started");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 Done");
        }
    }

    public void thread3(){
        synchronized (this) {
            System.out.println("Thread 3 Started");
            System.out.println("Thread 3 Done");
            notifyAll();
        }
    }

    public static void main(String[] args) {
        Ques14 demo = new Ques14();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.thread1();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.thread2();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.thread3();
            }
        }).start();
    }
}
