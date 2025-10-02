public class Employee {
    String name;
    int id;

    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Anita", 101);
        Employee e2 = new Employee("Rahul", 102);

        e1.display();
        e2.display();
    }
}
