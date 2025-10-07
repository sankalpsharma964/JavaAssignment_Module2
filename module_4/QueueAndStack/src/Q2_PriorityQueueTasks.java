import java.util.*;

public class Q2_PriorityQueueTasks {
    static class Task {
        final String name;
        final int priority;
        Task(String name, int priority) { this.name = name; this.priority = priority; }
        public String toString() { return name + "(" + priority + ")"; }
    }

    public static void main(String[] args) {
        PriorityQueue<Task> pq = new PriorityQueue<>(Comparator.comparingInt((Task t) -> t.priority).reversed());

        pq.add(new Task("Fix bug", 2));
        pq.add(new Task("Release build", 5));
        pq.add(new Task("Write docs", 1));
        pq.add(new Task("Code review", 3));

        System.out.println("Queue (heap view): " + pq);

        Task highest = pq.poll();
        System.out.println("Removed highest: " + highest);

        System.out.println("Remaining by priority:");
        PriorityQueue<Task> copy = new PriorityQueue<>(pq.comparator());
        copy.addAll(pq);
        while (!copy.isEmpty()) System.out.print(copy.poll() + " ");
        System.out.println();
    }
}
