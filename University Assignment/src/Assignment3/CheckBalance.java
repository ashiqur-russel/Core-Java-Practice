package Assignment3;

public class CheckBalance extends Account {

    public CheckBalance(int number, double balance) {
        super(number, balance);
    }

    @Override
    public void checkAccountBalance() {
        System.out.println("This account number (" + getAccountNumber() + ") has " + String.format("%.2f", getBalance()) + " on his account");
    }
}
