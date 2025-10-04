class Box<T> {
    private T item;
    void addItem(T item) { this.item = item; }
    T getItem() { return item; }
}

public class Q1_DemoGenericBox {
    public static void main(String[] args) {
        Box<String> sb = new Box<>();
        sb.addItem("Hello Generics");
        System.out.println("String box: " + sb.getItem());

        Box<Integer> ib = new Box<>();
        ib.addItem(42);
        System.out.println("Integer box: " + ib.getItem());
    }
}
