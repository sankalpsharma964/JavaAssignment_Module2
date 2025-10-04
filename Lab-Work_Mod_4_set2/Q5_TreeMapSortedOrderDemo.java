import java.util.*;

public class Q5_TreeMapSortedOrderDemo {
    public static void main(String[] args) {
        Map<Integer, String> tm = new TreeMap<>();

        tm.put(50, "Esha");
        tm.put(10, "Aarav");
        tm.put(30, "Chirag");
        tm.put(20, "Bhavya");
        tm.put(40, "Dev");

        System.out.println("TreeMap (ascending by key):");
        for (Map.Entry<Integer,String> e : tm.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());

        System.out.println("\nDescending view:");
        for (Map.Entry<Integer,String> e : ((TreeMap<Integer,String>) tm).descendingMap().entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }
}
