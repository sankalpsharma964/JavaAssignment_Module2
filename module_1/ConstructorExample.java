class Student3 {
    String name;
    int age;

    Student3() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructor called");
    }

    Student3(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {

        Student3 s1 = new Student3();
        s1.display();

        Student3 s2 = new Student3("Sankalp", 20);
        s2.display();
    }
}
