class Writer {
    void write() {
        System.out.println("Writing with a pen.");
    }
}

class Author extends Writer {
    void write() {
        super.write();
        System.out.println("Writing a novel.");
    }
}

public class Story {
    public static void main(String[] args) {
        Author a = new Author();
        a.write();
    }
}
