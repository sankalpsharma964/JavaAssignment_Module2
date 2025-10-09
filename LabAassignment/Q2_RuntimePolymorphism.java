public class Q2_RuntimePolymorphism {
    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee(101, "Asha", 60000, 0.20, 0.10);
        Employee e2 = new ContractualEmployee(102, "Rahul", 800, 160);
        Employee e3 = new PermanentEmployee(103, "Neha", 85000, 0.25, 0.12);
        Employee e4 = new ContractualEmployee(104, "Vikram", 1200, 100);

        Employee[] payroll = { e1, e2, e3, e4 };
        for (Employee e : payroll) {
            System.out.println(e.paySlip());
        }
    }
}

abstract class Employee {
    private final int id;
    private final String name;

    protected Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();

    public String paySlip() {
        return String.format("Employee[id=%d, name=%s] -> Salary: %.2f", id, name, calculateSalary());
    }
}

class PermanentEmployee extends Employee {
    private final double basic;
    private final double hraRate;
    private final double pfRate;

    public PermanentEmployee(int id, String name, double basic, double hraRate, double pfRate) {
        super(id, name);
        this.basic = basic;
        this.hraRate = hraRate;
        this.pfRate = pfRate;
    }

    @Override
    public double calculateSalary() {
        double hra = basic * hraRate;
        double pf = basic * pfRate;
        return basic + hra - pf;
    }
}

class ContractualEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public ContractualEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

