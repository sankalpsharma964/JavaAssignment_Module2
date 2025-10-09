import java.util.*;

public class Q8_Collections {
    public static void main(String[] args) {
        List<String> employeeNames = new ArrayList<>();
        employeeNames.add("Asha");
        employeeNames.add("Rahul");
        employeeNames.add("Neha");
        employeeNames.add("Vikram");

        Set<String> departments = new HashSet<>();
        departments.add("HR");
        departments.add("IT");
        departments.add("Finance");
        departments.add("IT");

        Map<Integer, String> idToName = new HashMap<>();
        idToName.put(101, "Asha");
        idToName.put(102, "Rahul");
        idToName.put(103, "Neha");
        idToName.put(104, "Vikram");

        System.out.println("Employee Names (ArrayList): " + employeeNames);
        System.out.println("Unique Departments (HashSet): " + departments);
        System.out.println("Employee ID -> Name (HashMap):");
        for (Map.Entry<Integer, String> e : idToName.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}

