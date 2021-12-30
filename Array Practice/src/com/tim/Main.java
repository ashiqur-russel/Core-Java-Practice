package com.tim;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static int [] baseData = new int[10];
    public static void main(String[] args) {
        System.out.println("Enter 10 num");
        getInput();
        printArray(baseData);

    }
    private static void getInput()
    {
        for(int i=0;i<baseData.length;i++){
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int [] arr){
        for (int i= 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
            System.out.println();
        }
    }
}
