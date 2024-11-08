package src.libs;

public class CreditAccount {

    public int id;
    public String name;
    public double annualIncome;
    public double creditLimit;

    public CreditAccount(int id, String name, double annualIncome, double creditLimit) {
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

    public static void hello() {
        System.out.println("Hello");
    }
}
