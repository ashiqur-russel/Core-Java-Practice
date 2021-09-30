package com.udemy;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);

        printDoubles(items);

    }

    public static void printDoubles(ArrayList<Integer> n) {
        for (int i : n) {
            System.out.println(i * 2);
        }
    }


}
