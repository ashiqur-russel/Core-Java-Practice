package com._1tim;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        for (int i=0;i<intList.size();i++){
            System.out.println(i+" "+intList.get(i));
        }

        intList.add(1,4);
        System.out.println();
        for (int i=0;i<intList.size();i++){
            System.out.println(i+" "+intList.get(i));
        }

    }
}
