import java.util.*;

public class Q6_HashSetUniquenessDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("Alpha"));
        System.out.println(set.add("Beta"));
        System.out.println(set.add("Alpha"));
        System.out.println(set.add(null));
        System.out.println(set.add(null));
        System.out.println("Set contents: " + set);
        System.out.println("Size: " + set.size());
    }
}
