import java.util.*;

public class Q7_TreeSetOpsDemo {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(42);
        nums.add(7);
        nums.add(19);
        nums.add(73);
        nums.add(7);
        System.out.println("Set: " + nums);

        Integer smallest = nums.first();
        Integer largest = nums.last();
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        boolean removed = nums.remove(19);
        System.out.println("Removed 19: " + removed);
        System.out.println("After removal: " + nums);
    }
}
