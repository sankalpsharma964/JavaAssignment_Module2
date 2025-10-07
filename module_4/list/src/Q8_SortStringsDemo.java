import java.util.*;

public class Q8_SortStringsDemo {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Banana", "apple", "Cherry", "date", "Elderberry"));

        List<String> asc = new ArrayList<>(words);
        asc.sort(Comparator.naturalOrder());
        System.out.println("Ascending: " + asc);

        List<String> desc = new ArrayList<>(words);
        desc.sort(Comparator.reverseOrder());
        System.out.println("Descending: " + desc);
    }
}
