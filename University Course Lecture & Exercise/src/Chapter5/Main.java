package Chapter5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person[] friends = new Person[3];
        int i = 0;

        for (i = 0; i <= friends.length; i++) {
            String name = input.nextLine();
            friends[i] = new Person(name);

        }
        System.out.println(friends[i].name);

    }
}
