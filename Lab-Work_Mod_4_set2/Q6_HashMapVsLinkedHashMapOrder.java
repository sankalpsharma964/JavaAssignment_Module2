import java.util.*;

public class Q6_HashMapVsLinkedHashMapOrder {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();
        hm.put(3, "C"); hm.put(1, "A"); hm.put(4, "D"); hm.put(2, "B");
        System.out.println("HashMap iteration (no guaranteed order):");
        for (Map.Entry<Integer,String> e : hm.entrySet())
            System.out.print(e.getKey() + "=" + e.getValue() + " ");
        System.out.println("\n");

        Map<Integer, String> lhmInsertion = new LinkedHashMap<>();
        lhmInsertion.put(3, "C"); lhmInsertion.put(1, "A"); lhmInsertion.put(4, "D"); lhmInsertion.put(2, "B");
        System.out.println("LinkedHashMap (insertion order):");
        for (Map.Entry<Integer,String> e : lhmInsertion.entrySet())
            System.out.print(e.getKey() + "=" + e.getValue() + " ");
        System.out.println("\n");

        Map<Integer, String> lhmAccess = new LinkedHashMap<>(16, 0.75f, true); // access-order
        lhmAccess.put(3, "C"); lhmAccess.put(1, "A"); lhmAccess.put(4, "D"); lhmAccess.put(2, "B");
        lhmAccess.get(3); lhmAccess.get(1); // recent accesses move to the end
        System.out.println("LinkedHashMap (access order after get(3), get(1)):");
        for (Map.Entry<Integer,String> e : lhmAccess.entrySet())
            System.out.print(e.getKey() + "=" + e.getValue() + " ");
        System.out.println();
    }
}
