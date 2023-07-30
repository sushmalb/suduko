import java.util.HashMap;
import java.util.Map;

public class BasicHashMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("Map","Collection");
        map.put("col","Collection1");

        for(Map.Entry m: map.entrySet()){
            System.out.println("Key:"+m.getKey()+" Value is:"+m.getValue());
            System.out.println(map.get("col"));
        }
    }

}

