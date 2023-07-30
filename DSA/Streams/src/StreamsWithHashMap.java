import java.util.*;
import java.util.stream.Collectors;



public class StreamsWithHashMap {
    public static void main(String[] args) {
        HashMap<String,String> hMap = new HashMap<>();
        hMap.put("1","value1");
        hMap.put("2","value2");
        hMap.put("3","value3");
        hMap.put("4","value4");
        hMap.put("5","value5");

        List<String> listOfString = hMap.entrySet().stream().filter(i ->i.getKey().startsWith("2"))
                .map(Map.Entry::getValue).collect(Collectors.toList());
        System.out.println(listOfString);

        List<String> l1  =  Arrays.asList("aaa","bbb","ccc","aaa","ddd","ddd");
        List<String> l2  = l1.stream().distinct().collect(Collectors.toList());
        System.out.println(l2);

    }
}
