public class Q7_GenericBox {
    public static void main(String[] args) {
        Box<String> bs = new Box<>("Hello");
        System.out.println(bs.get());
        bs.set("World");
        System.out.println(bs.get());

        Box<Integer> bi = new Box<>(42);
        System.out.println(bi.get());
        bi.set(100);
        System.out.println(bi.get());
    }
}

class Box<T> {
    private T value;

    public Box() {}
    public Box(T value) { this.value = value; }

    public void set(T value) { this.value = value; }
    public T get() { return value; }
}
