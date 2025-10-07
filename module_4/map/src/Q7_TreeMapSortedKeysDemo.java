import java.util.*;

public class Q7_TreeMapSortedKeysDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(42, "Zed");
        map.put(7, "Alice");
        map.put(19, "Bob");
        map.put(3, "Nina");
        map.put(73, "Kai");

        System.out.println("TreeMap: " + map);
        System.out.println("Keys (sorted): " + map.keySet());
        System.out.println("Entries (sorted by key):");
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
