package Assignment3;

public class Main {
    // Main Method to start the program

    public static void main(String[] args) {
        Account a1 = new Account(5566, 0.00);
        Account a2 = new Account(5674);

        System.out.println(a1.toString());
        a1.credit(11.1);

        System.out.println(a1.toString());
        a1.debit(5.5);

        System.out.println(a1.toString());
        a1.transferTo(1.0, a2);

        System.out.println(a1.toString());
        System.out.println();
        a1.transferTo(8.0, a2);
        System.out.println();
        System.out.println(a1.toString());

    }
}

