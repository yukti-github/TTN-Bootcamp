import java.util.concurrent.*;

public class Ques6 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> integerfuture= executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 100;
            }
        });

        executorService.shutdown();
        if(integerfuture.isDone())
            System.out.println("Task has been completed:- return value is- "+integerfuture.get());

        else if(integerfuture.isCancelled())
            System.out.println("Has the task cancelled?- "+integerfuture.isCancelled());
    }
}
