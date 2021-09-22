package chapter8;

public class BankAccount {

    private double balance = 0;
    private BankAccount recipient;

    BankAccount(double initialPayment) {
        this.balance = initialPayment;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount getRecipient() {
        return recipient;
    }

    public void setRecipient(BankAccount recipient) {
        this.recipient = recipient;
    }

    protected void deposit(double amount) {
        this.balance += amount;
    }


    public void transfer(double amount, BankAccount recipient) {
        this.balance -= amount;

        recipient.deposit(amount);
    }

}
