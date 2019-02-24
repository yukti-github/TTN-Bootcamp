import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Ques7 {
    public static void main(String[] args) throws InterruptedException {
        List<Callable<Integer>> List= new ArrayList<>();

        List.add(()->{ return 1;  });

        List.add(()->{ return 2;  });

        List.add(()->{ return 3;  });

        List.add(()->{ return 4;  });

        ExecutorService executorService= Executors.newSingleThreadExecutor();

       List<Future<Integer>> futureList= executorService.invokeAll(List);
        futureList.forEach((e)->{
            if(e.isDone()){
                try {
                    System.out.println("Item number "+e.get()+" from list");
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        });
        executorService.shutdown();
    }
}
