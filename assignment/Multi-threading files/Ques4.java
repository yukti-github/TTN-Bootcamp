import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques4 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 1 submitted");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {

                    System.out.println("thread 2 submitted");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("thread 3 submitted");
                }
            });

        }
        finally {
            executorService.shutdownNow();
            //executorService.shutdown();
        }
        System.out.println("Has executor service shut down:- "+
                executorService.isShutdown());
        System.out.println("Has executor service terminated?- "+
                executorService.isTerminated());
        System.out.println("ended");

    }
}

