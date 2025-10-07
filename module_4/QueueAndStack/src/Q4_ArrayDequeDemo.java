import java.util.*;

public class Q4_ArrayDequeDemo {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("B");
        dq.addLast("C");
        dq.addFirst("A");
        dq.addLast("D");
        System.out.println("After adds: " + dq);

        System.out.println("Peek first: " + dq.peekFirst());
        System.out.println("Peek last: " + dq.peekLast());

        System.out.println("Remove first: " + dq.removeFirst());
        System.out.println("Remove last: " + dq.removeLast());
        System.out.println("After removes: " + dq);
    }
}
