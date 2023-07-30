import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamListOfList {
    public static void main(String[] args) {
        List<Integer> list1  = Arrays.asList(1,3,4,5,6);
        List<Integer> list2  = Arrays.asList(1,2,4,6,7);
        List<Integer> list3  = Arrays.asList(9,6,4,3,2);

        List<List<Integer>> list =  Arrays.asList(list1,list2,list3);

        List<Integer> newList = list.stream().flatMap(li->li.stream()).toList();
        System.out.println(newList);

        list1.stream().peek(n-> System.out.println("Current Element:"+n)).map(n ->n*n).forEach(n-> System.out.println(n));

        List<Integer> list4 = list1.stream().limit(3).collect(Collectors.toList());
        List<Integer> list5 = list.stream().flatMap(li->li.stream()).peek(e-> System.out.println(e)).limit(3).collect(Collectors.toList());
        System.out.println("First 3 elements in list1 are:"+list4);
        System.out.println(list5);

        Stream<String> stream = Stream.of("Math","Science","English");
        boolean result  = stream.anyMatch(s->s.contains(("aM")));
        System.out.println();

        //the reduce method helps you combine all the elements of a collection into a single result by repeatedly
        // applying a specific operation.

        Optional<Integer> i = list5.stream().reduce(Integer::sum);
        int j = list5.stream().reduce(Integer::sum).get();
        System.out.println("Sum is:"+ i);
        System.out.println(j);

    }
}
