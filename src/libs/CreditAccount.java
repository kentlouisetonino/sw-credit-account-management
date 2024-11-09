package src.libs;

public class CreditAccount {

    public int id;
    public String name;
    public double annualIncome;
    public double creditLimit;
    public double creditBalance;
    public double purchaseAmount;

    public CreditAccount(int id, String name, double annualIncome) {
        this.id = id;
        this.name = name;
        this.annualIncome = annualIncome;

        if (annualIncome >= 200000 && annualIncome <= 300000) {
            this.creditLimit = 30000;
        } else if (annualIncome >= 300000 && annualIncome <= 500000) {
            this.creditLimit = 50000;
        } else if (annualIncome >= 500000) {
            this.creditLimit = 100000;
        } else {
            this.creditLimit = 0;
        }

        this.creditBalance = 0;
        this.purchaseAmount = this.creditLimit - this.creditBalance;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getAnnualIncome() {
        return this.annualIncome;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public double getCreditBalance() {
        return this.creditBalance;
    }

    public double getPurchaseAmount() {
        return this.purchaseAmount;
    }

    public void setCreditBalance(double newCreditBalance) {
        this.creditBalance = newCreditBalance;
    }

    public void setPurchaseAmount(double newPurchaseAmount) {
        this.purchaseAmount = newPurchaseAmount;
    }
}
