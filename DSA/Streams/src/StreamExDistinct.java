import java.util.Arrays;
import java.util.List;

public class StreamExDistinct {
    public static void main(String[] args) {
        List<String> l1  =  Arrays.asList("aaa","bbb","ccc","aaa","ddd","ddd");
        long z =l1.stream().distinct().count();
        System.out.println("Count of unique value is:"+ z);
    }
}
