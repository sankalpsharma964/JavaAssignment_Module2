package banking;

public class Loan {
    private boolean approved;
    private double sanctionedAmount;
    private double interestRate;
    private int tenureMonths;

    public boolean sanction(Account linkedAccount, double amount, int creditScore) {
        boolean eligible = creditScore >= 700 && amount <= linkedAccount.getBalance() * 5;
        approved = eligible;
        sanctionedAmount = eligible ? amount : 0.0;
        interestRate = eligible ? 0.12 : 0.0;
        tenureMonths = eligible ? 24 : 0;
        return approved;
    }

    public String status() {
        if (!approved) return "Loan not approved";
        return String.format("Loan approved: amount=%.2f, rate=%.2f, tenure=%d months",
                sanctionedAmount, interestRate, tenureMonths);
    }
}

