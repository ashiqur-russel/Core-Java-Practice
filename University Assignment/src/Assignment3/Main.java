package Assignment3;

public class Main {
    // Main Method to start the program

    public static void main(String[] args) {
        // Two account object created
        Account person1 = new Account(5566, 0.00);
        Account person2 = new Account(5674);


        System.out.println(person1.toString());

        // $11.1 credited to person 1 account
        person1.credit(11.1);


        System.out.println(person1.toString());

        // $ debited from person 1 account
        person1.debit(5.5);

        System.out.println(person1.toString());

        // $ transferred to person 2 account from person 1 account
        person1.transferTo(1.0, person2);

        System.out.println(person1.toString());
        System.out.println();

        // $ transferred to person 2 account from person 1 account
        person1.transferTo(8.0, person2);

        System.out.println();

        //check the balance from toString method
        System.out.println(person1.toString());

        System.out.println();

        // $ transferred to person 2 account from person 1 account
        person1.transferTo(1.0, person2);


        // check the person 1 account balance from check balance class
        person1.checkAccountBalance();


        // check the person 2 account balance from check balance class
        person2.checkAccountBalance();


    }
}

