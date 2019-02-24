public class Ques2 {

    public static void main(String[] args) throws InterruptedException {

      Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(1000L);
                System.out.println("thread 1 running");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(2000L);
                System.out.println("thread 2 running");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000L);
                    System.out.println("thread 3 running");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        System.out.println("thread 1 joined");
        thread3.join();
        System.out.println("thread 3 joined");
        thread2.join();
        System.out.println("thread 2 joined ");
    }
}