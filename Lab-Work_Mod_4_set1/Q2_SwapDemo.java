import java.util.Arrays;

public class Q2_SwapDemo {
    public static <T> void swapElements(T[] array, int i, int j) {
        if (array == null) throw new IllegalArgumentException("array is null");
        if (i < 0 || j < 0 || i >= array.length || j >= array.length)
            throw new IndexOutOfBoundsException("bad index");
        if (i == j) return;
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        Integer[] ai = {1, 2, 3, 4};
        System.out.println("Before (Integer): " + Arrays.toString(ai));
        swapElements(ai, 1, 3);
        System.out.println("After  (Integer): " + Arrays.toString(ai));

        String[] as = {"alpha", "beta", "gamma"};
        System.out.println("\nBefore (String): " + Arrays.toString(as));
        swapElements(as, 0, 2);
        System.out.println("After  (String): " + Arrays.toString(as));

        Double[] ad = {2.5, 7.7, 9.9, 0.1};
        System.out.println("\nBefore (Double): " + Arrays.toString(ad));
        swapElements(ad, 2, 3);
        System.out.println("After  (Double): " + Arrays.toString(ad));
    }
}
