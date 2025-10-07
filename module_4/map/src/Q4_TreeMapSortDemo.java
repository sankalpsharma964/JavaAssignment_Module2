import java.util.*;

public class Q4_TreeMapSortDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(42, "Zed");
        map.put(7, "Alice");
        map.put(19, "Bob");
        map.put(3, "Nina");
        map.put(73, "Kai");

        System.out.println("TreeMap (sorted by key): " + map);
        System.out.println("Keys: " + ((TreeMap<Integer,String>) map).navigableKeySet());
        System.out.println("First key: " + ((TreeMap<Integer,String>) map).firstKey());
        System.out.println("Last key: " + ((TreeMap<Integer,String>) map).lastKey());
    }
}
