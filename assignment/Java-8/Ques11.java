import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques11 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(6, 3, 0, 7, 40, 10, 2);
        System.out.println(list.stream().collect(Collectors.averagingInt(e->e*2)));
    }
}