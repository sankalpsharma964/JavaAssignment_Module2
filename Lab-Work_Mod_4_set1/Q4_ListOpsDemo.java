import java.util.*;

public class Q4_ListOpsDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("alpha");
        list.add("beta");
        list.add("gamma");
        System.out.println("After adds: " + list);

        boolean removedByValue = list.remove("beta");
        System.out.println("Removed 'beta'? " + removedByValue + " -> " + list);

        String removedByIndex = list.remove(0);
        System.out.println("Removed index 0 (" + removedByIndex + "): " + list);

        list.add("delta");
        list.add("epsilon");
        System.out.println("After more adds: " + list);

        list.set(1, "zeta");
        System.out.println("After replace at index 1 with 'zeta': " + list);
    }
}
