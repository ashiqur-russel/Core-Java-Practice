package Assignment3;

public class Account {

    private int accountNumber;
    private double balance;

    /**
     * Constructor one with one argument
     *
     * @param number take the account number
     */

    public Account(int number) {
        this.accountNumber = number;
    }

    /**
     * Anothe constructor for Account class with two argument
     *
     * @param number  take the account number
     * @param balance for taking the balance
     */
    public Account(int number, double balance) {
        this.accountNumber = number;
        this.balance = balance;
    }


    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {

        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // public method which subtracts the given amount from the balance


    public double debit(double amount) {

        if (this.balance <= 0) {
            return 0;
        } else {
            this.balance -= amount;

        }
        return this.balance;

    }

    // public method which Add the given amount to the balance


    public double credit(double amount) {


        return this.balance += amount;

    }


    // public method which Transfer the given amount to the Another person account if There is sufficient balance


    public double transferTo(double amount, Account another) {


        if (this.balance > amount) {
            this.balance -= amount;

            // save transferred amount to the another account
            another.credit(amount);
        } else {
            System.out.println("Account balance insufficient. transaction cannot be posted");
        }
        return this.balance;

    }

    public void checkAccountBalance() {
        System.out.println("This account number (" + getAccountNumber() + ") has " + String.format("%.2f", getBalance()) + " on his account");
    }

    public String toString() {
        return " A/C no : " + this.accountNumber + "  " + "Balance = " + String.format("%.2f", getBalance());
    }

}
