import java.util.*;

public class Q6_HashMapEmployeeDemo {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "Alice");
        employees.put(102, "Bob");
        employees.put(103, "Charlie");
        System.out.println("Map: " + employees);

        System.out.println("Has 102? " + employees.containsKey(102));
        System.out.println("Has 999? " + employees.containsKey(999));

        System.out.println("Iterate via keySet:");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " -> " + employees.get(id));
        }

        System.out.println("Iterate via entrySet:");
        for (Map.Entry<Integer, String> e : employees.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

