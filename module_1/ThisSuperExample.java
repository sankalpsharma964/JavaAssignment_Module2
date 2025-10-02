
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

// Child class
class Student extends Person {
    int rollNo;

    Student(String name, int rollNo) {
        super(name);
        this.rollNo = rollNo;
    }

    void display() {
        super.display();
        System.out.println("Roll No: " + this.rollNo);
    }
}

public class ThisSuperExample {
    public static void main(String[] args) {
        Student s = new Student("Sankalp", 101);
        s.display();
    }
}

