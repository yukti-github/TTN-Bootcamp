import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ques12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 13, 2, 9, 7, 56, 43, 12);
        Optional<Integer> optional = list.stream().filter(e -> e % 2 == 0).filter(e -> e > 3).findFirst();
        if(optional.isPresent())
            System.out.println(optional.get());
        else
            System.out.println("no element present");
    }
}
