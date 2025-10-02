class Citizen {
    private String name = "PrivateName";
    String city = "Delhi";
    protected int age = 21;
    public String country = "India";

    private void privateMethod() {
        System.out.println("Private Method");
    }

    void defaultMethod() {
        System.out.println("Default Method");
    }

    protected void protectedMethod() {
        System.out.println("Protected Method");
    }

    public void publicMethod() {
        System.out.println("Public Method");
    }

    public void show() {
        System.out.println(name);
        privateMethod();
    }
}

public class AccessExample {
    public static void main(String[] args) {
        Citizen c = new Citizen();
        System.out.println(c.city);
        System.out.println(c.age);
        System.out.println(c.country);

        c.defaultMethod();
        c.protectedMethod();
        c.publicMethod();
        c.show();
    }
}

