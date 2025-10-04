import java.util.*;

public class Q3_TreeMapSortingDemo {
    public static void main(String[] args) {
        Map<String, Integer> natural = new TreeMap<>();
        natural.put("banana", 3);
        natural.put("apple", 5);
        natural.put("cherry", 2);
        natural.put("date", 7);

        System.out.println("Natural (ascending) key order:");
        for (Map.Entry<String,Integer> e : natural.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());

        Map<String, Integer> reverse = new TreeMap<>(Comparator.reverseOrder());
        reverse.putAll(natural);

        System.out.println("\nCustom (descending) key order:");
        for (Map.Entry<String,Integer> e : reverse.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());

        System.out.println("\nFirst key: " + ((TreeMap<String,Integer>) natural).firstKey());
        System.out.println("Last key: " + ((TreeMap<String,Integer>) natural).lastKey());
        System.out.println("Keys between [banana, date): " + ((TreeMap<String,Integer>) natural).subMap("banana", "date"));
    }
}
