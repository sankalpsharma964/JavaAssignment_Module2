public class MinMaxArray {
    public static void main(String[] args) {
        int[] numbers = {23, 5, 87, 14, 67, 1, 90};

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min)
                min = numbers[i];
            if (numbers[i] > max)
                max = numbers[i];
        }

        System.out.println("Smallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}

