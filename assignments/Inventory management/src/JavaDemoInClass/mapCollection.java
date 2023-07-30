package JavaDemoInClass;

import java.util.HashMap;
import java.util.Map;

public class mapCollection {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Raj");
        map.put(2,"Jay");
        map.put(3,"Kiran");

        for(Map.Entry m : map.entrySet()){
            System.out.println("key:" + m.getKey()+" value:"+m.getValue());
        }

        System.out.println(map.get(2));
    }
}
