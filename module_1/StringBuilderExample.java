public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World ");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.delete(8, 9);
        System.out.println(sb.toString());
    }
}

