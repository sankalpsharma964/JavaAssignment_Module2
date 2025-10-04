import java.util.*;

public class Q4_HashMapEmployeeDemo {
    public static void main(String[] args) {
        Map<Integer, String> emp = new HashMap<>();

        emp.put(101, "Aarav");
        emp.put(102, "Bhavya");
        emp.put(103, "Chirag");
        System.out.println("After adds: " + emp);

        emp.putIfAbsent(104, "Dev");
        emp.put(102, "Bhavya S"); // update existing
        System.out.println("After more adds/updates: " + emp);

        int checkId = 103;
        System.out.println("Contains key " + checkId + "? " + emp.containsKey(checkId));

        System.out.println("\nIterate via keySet:");
        for (Integer id : emp.keySet()) {
            System.out.println(id + " -> " + emp.get(id));
        }

        System.out.println("\nIterate via entrySet:");
        for (Map.Entry<Integer, String> e : emp.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
