import java.util.*;

public class Q3_IterateListDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50);

        System.out.print("Simple for: ");
        for (int i = 0; i < nums.size(); i++) System.out.print(nums.get(i) + " ");
        System.out.println();

        System.out.print("Enhanced for: ");
        for (int n : nums) System.out.print(n + " ");
        System.out.println();

        System.out.print("While + Iterator: ");
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
    }
}

