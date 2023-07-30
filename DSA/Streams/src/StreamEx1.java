import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> squaredNums = numbers.stream().map(n -> n*n).collect(Collectors.toList());
        System.out.println("Squared Numbers are:"+squaredNums);

        int sumOfNumbers = numbers.stream().reduce(0,Integer::sum);
        System.out.println("Sum of numbers:"+sumOfNumbers);

    }
}
