final class Library {
    final void open() {
        System.out.println("Library is now open.");
    }
}

// This will cause a compile-time error if you try to extend Library
// class DigitalLibrary extends Library { } // Not allowed

public class Read {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.open();
    }
}

