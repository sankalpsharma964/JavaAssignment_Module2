import java.util.*;

public class Q3_StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Empty? " + stack.empty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After pushes: " + stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);

        System.out.println("Empty? " + stack.empty());
    }
}
