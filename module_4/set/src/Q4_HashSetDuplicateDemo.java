import java.util.*;

public class Q4_HashSetDuplicateDemo {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        System.out.println(s.add("Alpha"));
        System.out.println(s.add("Beta"));
        System.out.println(s.add("Alpha"));
        System.out.println("Set: " + s);
    }
}
