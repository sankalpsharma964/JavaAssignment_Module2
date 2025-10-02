public class Student2 {
    String name;
    int age;

    Student2() {
        name = "Unknown";
        age = 0;
    }

    Student2(String n) {
        name = n;
        age = 18;
    }

    Student2(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2();
        Student2 s2 = new Student2("Ravi");
        Student2 s3 = new Student2("Priya", 21);

        s1.display();
        s2.display();
        s3.display();
    }
}
