import java.util.*;

class Student {
    final String name;
    final int marks;
    Student(String name, int marks) { this.name = name; this.marks = marks; }
    public String toString() { return name + "(" + marks + ")"; }
}

public class Q6_SortStudentsWithComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Aarav", 88),
                new Student("Bhavya", 95),
                new Student("Chirag", 88),
                new Student("Dev", 72),
                new Student("Esha", 95)
        ));

        List<Student> byMarksDesc = new ArrayList<>(students);
        byMarksDesc.sort(Comparator.comparingInt((Student s) -> s.marks).reversed()
                .thenComparing(s -> s.name));
        System.out.println("By marks desc, name asc: " + byMarksDesc);

        List<Student> byNameAsc = new ArrayList<>(students);
        byNameAsc.sort(Comparator.comparing(s -> s.name));
        System.out.println("By name asc: " + byNameAsc);
    }
}

