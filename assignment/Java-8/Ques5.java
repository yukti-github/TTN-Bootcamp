import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5 {
    public static void main(String[] args) {

        Predicate<Integer> isGreaterThan5 = e -> e > 5 ? true : false;
        System.out.println("is 2 greater than 5- " + isGreaterThan5.test(2));

        Consumer<String> display= e-> System.out.println("consumer running on string= "+e);
        display.accept("consumerrr");

        Supplier<Integer> supplier = ()->1;
        System.out.println("value returned from supplier is- "+supplier.get());

        Function<Integer,Integer> square = e->e*e;
        System.out.println("square of 13 is- "+square.apply(13));

    }
}