import java.util.*;

public class Q8_LinkedHashSetOrderDemo {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("Alpha");
        set.add("Beta");
        set.add("Gamma");
        System.out.println("Initial: " + set);

        set.add("Delta");
        System.out.println("After adding Delta: " + set);

        set.add("Beta");
        System.out.println("After re-adding Beta (no change): " + set);

        set.remove("Beta");
        set.add("Beta");
        System.out.println("After remove+add Beta (moves to end): " + set);

        System.out.print("Iterating in insertion order: ");
        for (String s : set) System.out.print(s + " ");
        System.out.println();
    }
}
