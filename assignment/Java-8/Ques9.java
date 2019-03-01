import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(32,5,9,67,90,24,65);
        System.out.println(list.stream().filter(e->e%2==0).collect(Collectors.toList()));
    }
}

