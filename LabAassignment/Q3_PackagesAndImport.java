import banking.*;

public class Q3_PackagesAndImport {
    public static void main(String[] args) {
        Account acc = new Account("SB-1001", "Asha", 10000);
        acc.deposit(5000);
        System.out.println(acc);

        Loan loan = new Loan();
        boolean ok = loan.sanction(acc, 30000, 720);
        System.out.println(ok ? loan.status() : "Loan rejected");

        acc.withdraw(2000);
        System.out.println("Balance after withdrawal: " + acc.getBalance());
    }
}

