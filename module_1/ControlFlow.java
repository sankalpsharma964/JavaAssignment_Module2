public class ControlFlow {
    public static void main(String[] args) {
        int number = 3;

        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }

        switch (number) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other number");
        }

        for (int i = 1; i <= number; i++) {
            System.out.println("Count: " + i);
        }
    }
}

