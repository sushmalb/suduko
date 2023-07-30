import java.util.Arrays;
import java.util.List;

public class StreamsEx {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        List<Integer> list1 = list.stream().filter(i ->2 ==0).collect(Collectors.toList());
//        System.out.println(list1);

        list.stream().filter(i -> i%2 ==0).forEach(i-> System.out.println(i));
    }
}
