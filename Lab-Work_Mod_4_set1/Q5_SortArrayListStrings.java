import java.util.*;

public class Q5_SortArrayListStrings {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList(
                "banana", "Apple", "cherry", "date", "elderberry", "Fig"));

        System.out.println("Original: " + names);

        ArrayList<String> asc = new ArrayList<>(names);
        asc.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("Alphabetical: " + asc);

        ArrayList<String> desc = new ArrayList<>(names);
        desc.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println("Reverse alphabetical: " + desc);
    }
}
