public class MethodExample {
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

    public static void main(String[] args) {
        staticMethod();

        MethodExample obj = new MethodExample();
        obj.nonStaticMethod();
    }
}
