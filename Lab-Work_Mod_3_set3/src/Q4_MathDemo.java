public class Q4_MathDemo {
    public static void main(String[] args) {
        double r = Math.random();                 // [0.0, 1.0)
        int rand1to100 = (int)(r * 100) + 1;      // 1..100

        int n = -42;
        int absN = Math.abs(n);                   // 42

        double base = 3.0, exp = 4.0;
        double p = Math.pow(base, exp);           // 81.0

        System.out.println("Math.random(): " + r);
        System.out.println("Random int 1..100: " + rand1to100);
        System.out.println("Math.abs(-42): " + absN);
        System.out.println("Math.pow(3, 4): " + p);
    }
}
