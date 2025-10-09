public class Q1_StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student(); // default constructor
        Student s2 = new Student(101, "Asha", "B.Tech CSE"); // overloaded

        GraduateStudent g1 = new GraduateStudent(201, "Rahul", "M.Tech CSE",
                "Natural Language Processing", "Dr. Kumar"); // overloaded
        GraduateStudent g2 = new GraduateStudent(202, "Neha", "Computer Vision");

        Student[] roster = { s1, s2, g1, g2 };
        for (Student s : roster) {
            System.out.println(s.describe());
        }
    }
}
class Student {
    private int id;
    private String name;
    private String course;

    public Student() {
        this.id = 0;
        this.name = "Unknown";
        this.course = "Undeclared";
    }
    public Student(int id, String name) {
        this(id, name, "Undeclared");
    }
    public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
    public String describe() {
        return "Student[id=" + id + ", name=" + name + ", course=" + course + "]";
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
}
class GraduateStudent extends Student {
    private String researchArea;
    private String advisor;

    public GraduateStudent(int id, String name, String researchArea) {
        super(id, name, "Graduate Studies"); // default course for this overload
        this.researchArea = researchArea;
        this.advisor = "TBD";
    }
    public GraduateStudent(int id, String name, String course,
                           String researchArea, String advisor) {
        super(id, name, course);
        this.researchArea = researchArea;
        this.advisor = advisor;
    }
    @Override
    public String describe() {
        return super.describe() +
                " -> Graduate[researchArea=" + researchArea +
                ", advisor=" + advisor + "]";
    }
}
