import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ques5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try{
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread- 1");
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread-2");
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {

                System.out.println("thread-3");
            }
        });
    }
            finally{
            executorService.shutdown();
        }
        System.out.println("has thread shutdown:"+ executorService.isShutdown());
        System.out.println("has thread terminated:"+ executorService.isTerminated());

    }
}
