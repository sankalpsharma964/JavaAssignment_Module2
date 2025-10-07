import java.util.*;

public class Q8_HashMapVsLinkedHashMapOrder {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(42, "Zed");
        hashMap.put(7, "Alice");
        hashMap.put(19, "Bob");
        hashMap.put(3, "Nina");
        hashMap.put(73, "Kai");

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(42, "Zed");
        linkedHashMap.put(7, "Alice");
        linkedHashMap.put(19, "Bob");
        linkedHashMap.put(3, "Nina");
        linkedHashMap.put(73, "Kai");

        System.out.println("HashMap iteration order:");
        for (Map.Entry<Integer, String> e : hashMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

        System.out.println("\nLinkedHashMap iteration order (insertion order):");
        for (Map.Entry<Integer, String> e : linkedHashMap.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
