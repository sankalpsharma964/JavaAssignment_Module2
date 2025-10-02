class Tool {
    void use() {
        System.out.println("Tool is being used.");
    }
}

class Hammer extends Tool {
    void strike() {
        System.out.println("Hammer strikes the nail.");
    }
}

class ElectricHammer extends Hammer {
    void plugIn() {
        System.out.println("Electric hammer is plugged in.");
    }
}

public class Workshop {
    public static void main(String[] args) {
        ElectricHammer eh = new ElectricHammer();
        eh.use();
        eh.strike();
        eh.plugIn();
    }
}


