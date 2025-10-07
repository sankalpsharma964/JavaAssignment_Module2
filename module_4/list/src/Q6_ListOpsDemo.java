import java.util.*;

public class Q6_ListOpsDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        System.out.println("After add: " + fruits);

        fruits.remove("Banana");
        System.out.println("After remove(\"Banana\"): " + fruits);

        fruits.remove(1);
        System.out.println("After remove(1): " + fruits);

        fruits.set(1, "Blueberry");
        System.out.println("After set(1, \"Blueberry\"): " + fruits);
    }
}
