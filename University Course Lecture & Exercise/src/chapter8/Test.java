package chapter8;

public class Test {

    public static void main(String[] args) throws Exception {

        BankAccount firstAccount = new BankAccount(1000.00);
        BankAccount secondtAccount = new BankAccount(00);


        firstAccount.transfer(50, secondtAccount);
        System.out.println(firstAccount.getBalance());

        System.out.println(secondtAccount.getBalance());
        firstAccount.deposit(500);
        System.out.println(firstAccount.getBalance());


    }
}
