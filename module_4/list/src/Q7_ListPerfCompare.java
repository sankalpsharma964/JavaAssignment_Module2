import java.util.*;

public class Q7_ListPerfCompare {
    static long timeAddAtBeginning(List<Integer> list, int n) {
        long t1 = System.nanoTime();
        for (int i = 0; i < n; i++) list.add(0, i);
        return System.nanoTime() - t1;
    }

    static long timeRemoveMiddle(List<Integer> list, int n) {
        list.clear();
        for (int i = 0; i < n; i++) list.add(i);
        long t1 = System.nanoTime();
        for (int i = 0; i < n; i++) list.remove(list.size() / 2);
        return System.nanoTime() - t1;
    }

    static long timeIterate(List<Integer> list, int n) {
        list.clear();
        for (int i = 0; i < n; i++) list.add(i);
        long s = 0;
        long t1 = System.nanoTime();
        for (int v : list) s += v;
        long dt = System.nanoTime() - t1;
        if (s == -1) System.out.println();
        return dt;
    }

    static void run(String name, List<Integer> list, int n) {
        long addBeg = timeAddAtBeginning(newList(list), n);
        long remMid = timeRemoveMiddle(newList(list), n);
        long iter = timeIterate(newList(list), n);
        System.out.printf("%s%n", name);
        System.out.printf("Add at beginning: %.2f ms%n", addBeg / 1_000_000.0);
        System.out.printf("Remove middle:    %.2f ms%n", remMid / 1_000_000.0);
        System.out.printf("Iterate:          %.2f ms%n", iter / 1_000_000.0);
        System.out.println();
    }

    static List<Integer> newList(List<Integer> template) {
        return template instanceof LinkedList ? new LinkedList<>() : new ArrayList<>();
    }

    public static void main(String[] args) {
        int n = (args.length > 0) ? Integer.parseInt(args[0]) : 200000;
        run("ArrayList", new ArrayList<>(), n);
        run("LinkedList", new LinkedList<>(), n);
    }
}
