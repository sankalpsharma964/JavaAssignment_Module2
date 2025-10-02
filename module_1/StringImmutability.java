public class StringImmutability {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = str1;

        str1 = str1.concat(" World");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
    }
}
