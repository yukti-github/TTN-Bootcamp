import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,8,65,9,4,0,1,2,6);
        System.out.println("sum of numbers more than 5  are- "+
                list.stream()
                        .filter(e->e>5)
                        .collect(Collectors.summingInt(e->e)));
    }
}
