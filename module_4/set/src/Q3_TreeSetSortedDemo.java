import java.util.*;

public class Q3_TreeSetSortedDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(42);
        set.add(7);
        set.add(19);
        set.add(73);
        set.add(3);
        System.out.println("Ascending: " + set);
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());
        System.out.println("Descending: " + set.descendingSet());
    }
}
