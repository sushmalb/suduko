import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"AA");
        map.put(4,"BB");
        map.put(5,"CC");
        System.out.println(map);

        // Get the value for a specific key
        int key = 5;
        String value = map.get(key);
        System.out.println("Value of key:"+key+"-"+ value);

        System.out.println("First Entry:"+map.firstEntry());
        System.out.println("Last Entry:"+map.lastEntry());
        System.out.println("Size of Tree Map:"+map.size());
        System.out.println("Is the map empty:"+map.isEmpty());

        // Check if a key exists
        boolean containsKey = map.containsKey(2);
        System.out.println("Contains key 2:"+ containsKey);

        // Remove an element from the Treemap
        System.out.println("Value removed:"+map.remove(1));
        System.out.println(map);
        System.out.println("The keys are:"+map.keySet());
        System.out.println("The values are:"+map.values());
        System.out.println("The TreeSet is:"+map.entrySet());
        //System.out.println(map);
        map.clear();
        System.out.println("My Final Tree is:"+ map);

    }


}
